package cn.summer.new_bus_side.controller;

import cn.summer.new_bus_side.service_impl.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@Controller
public class LoginController {
    private static final Logger logger = LoggerFactory.getLogger(UserService.class);
    public static final String TOKEN = "ticket";
    public static final String RESULT =  "resultMessge";
    public static final String REG_LOGIN_RESULT = "/regLoginResult";
    @Autowired
    UserService userService;
    @RequestMapping(path={"/reg/"},method = {RequestMethod.GET,RequestMethod.POST})
    public String reg(Model model, @RequestParam("userId") String userId,
                      @RequestParam("password") String password,
                      @RequestParam(value = "rememberme",defaultValue = "0") int rememberme,
                      HttpServletResponse response) {

        Map<String, Object> map = userService.register(userId, password);
        verification(model,map,rememberme,response,"注册");
        return REG_LOGIN_RESULT;

    }
    @RequestMapping(path={"/login/"},method = {RequestMethod.GET,RequestMethod.POST})
    public String login(Model model, @RequestParam("userId") String userId,
                        @RequestParam("password") String password,
                        @RequestParam(value = "rememberme",defaultValue = "0") int rememberme,
                        HttpServletResponse response
                        ){
        Map<String,Object> map = userService.login(userId,password);
        verification(model,map,rememberme,response,"登录");
        return REG_LOGIN_RESULT;
    }

    @RequestMapping(path={"/logout"},method = {RequestMethod.GET,RequestMethod.POST})
    public String logout(@CookieValue(TOKEN) String ticket){
        userService.logout(ticket);
        return "redirect:/";
    }

    public void verification(Model model,Map<String, Object> map,
                                int rememberme, HttpServletResponse response,
                                String type) {
        try {
            if (map.containsKey(TOKEN)) {
                Cookie cookie = new Cookie(TOKEN, (String) map.get(TOKEN));
                cookie.setPath("/");
                if (rememberme > 0) {
                    cookie.setMaxAge(3600 * 24 * 5);
                }
                response.addCookie(cookie);
                model.addAttribute(RESULT, type + "成功");

            } else {
                model.addAttribute(RESULT, type + "失败");
            }
        } catch (Exception e) {
            logger.error(type,"{}异常{}", e.getMessage());
            model.addAttribute(RESULT, type+"异常");
        }
    }
    }
