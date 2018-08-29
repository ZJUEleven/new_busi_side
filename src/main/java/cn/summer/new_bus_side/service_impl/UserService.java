package cn.summer.new_bus_side.service_impl;

import cn.summer.new_bus_side.dao.TicketDao;
import cn.summer.new_bus_side.dao.UserDao;
import cn.summer.new_bus_side.domain.LoginTicket;
import cn.summer.new_bus_side.domain.User;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;
    @Autowired
    private TicketDao ticketDao;
    public  static final  String PSW ="password";

    public Map<String,Object> register(String userId, String password){
        Map<String,Object> map = new HashMap<>();
        if (StringUtils.isBlank(userId)){
            map.put("userid","id不能为空");
            return map;

        }
        if (StringUtils.isBlank(password)){
            map.put(PSW,"password不能为空");
            return map;
        }
        User user = userDao.selectById(userId);
        if ((user !=null)){
            map.put("userId","userid已经被注册");
            return map;
        }

        user = new User();
        user.setUserId(userId);
        user.setPassword(password);
        userDao.addUser(user);

        String ticket = addLoginTicket(user.getUserId());
        map.put("ticket",ticket);
        return map;
    }

    public Map<String,Object> login(String userId, String password){
        Map<String,Object> map = new HashMap<>();
        if (StringUtils.isBlank(userId)){
            map.put("userid","id不能为空");
            return map;

        }
        if (StringUtils.isBlank(password)){
            map.put(PSW,"password不能为空");
            return map;
        }

        User user = userDao.selectById(userId);

        if ((user ==null)){
            map.put("userId","userid不存在");
            return map;
        }
        if(!password.equals(user.getPassword())){
            map.put(PSW,"密码不正确");
            return map;

        }

        String ticket = addLoginTicket(user.getUserId());
        map.put("ticket",ticket);

        return map;
    }
    private String addLoginTicket(String userId){
        LoginTicket ticket = new LoginTicket();
        ticket.setUserId(userId);
        Date date = new Date();
        date.setTime(date.getTime()+1000*3600*24);
        ticket.setExpired(date);
        ticket.setTicket(UUID.randomUUID().toString().replaceAll("-",""));
        ticketDao.addTicket(ticket);
        return ticket.getTicket();

    }
    public String loginProve(String ticket){
        LoginTicket ticket1  = ticketDao.selectByTicket(ticket);
        Date nowTime = new Date();

        if (ticket1.getStatus()==0&&nowTime.before(ticket1.getExpired())){
            return ticket1.getUserId();
        }
        else {
            return null;
        }


    }
    public void logout(String ticket){
        ticketDao.updateStatus(ticket,1);

    }
}
