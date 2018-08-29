package cn.summer.new_bus_side.dao;

import cn.summer.new_bus_side.domain.LoginTicket;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface  TicketDao {


    @Insert({"insert into ", TicketConstants.TABLE_NAME, "(", TicketConstants.INSERT_FIELDS,
            ") values (#{userId},#{expired},#{status},#{ticket})"})
    int addTicket(LoginTicket ticket);

    @Select({"select ", TicketConstants.SELECT_FIELDS, " from ", TicketConstants.TABLE_NAME, " where ticket=#{ticket}"})
    LoginTicket selectByTicket(String ticket);

    @Update({"update ", TicketConstants.TABLE_NAME, " set status=#{status} where ticket=#{ticket}"})
    void updateStatus(@Param("ticket") String ticket, @Param("status") int status);

    @Select({"select ", TicketConstants.SELECT_FIELDS, " from ", TicketConstants.TABLE_NAME, " where id=#{id}"})
    LoginTicket selectById(int id);


}
