package cn.summer.new_bus_side.dao;

import cn.summer.new_bus_side.domain.Bill;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface BillMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Bill record);

    int insertSelective(Bill record);

    Bill selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Bill record);

    int updateByPrimaryKey(Bill record);


}