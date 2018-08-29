package cn.summer.new_bus_side.dao;

import cn.summer.new_bus_side.domain.Deal;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DealMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Deal record);

    int insertSelective(Deal record);

    Deal selectByPrimaryKey(Integer id);

    List<Deal>  selectByBusId(String busId);

    int updateByPrimaryKeySelective(Deal record);

    int updateByPrimaryKey(Deal record);

    List<Deal> selectByStatus(Byte status);

    void updateStatus(String busId);

    void updateBusId(String busId,String msgId);

}