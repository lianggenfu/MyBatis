package com.etc.dao;

import com.etc.entity.Logistics;
import com.etc.entity.LogisticsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LogisticsMapper {
    int countByExample(LogisticsExample example);

    int deleteByExample(LogisticsExample example);

    int deleteByPrimaryKey(Integer lid);

    int insert(Logistics record);

    int insertSelective(Logistics record);

    List<Logistics> selectByExample(LogisticsExample example);

    Logistics selectByPrimaryKey(Integer lid);
    
   //通过订单号查询物流记录
    List<Logistics> selectByDeliveryId(Integer deliveryid);

    int updateByExampleSelective(@Param("record") Logistics record, @Param("example") LogisticsExample example);

    int updateByExample(@Param("record") Logistics record, @Param("example") LogisticsExample example);

    int updateByPrimaryKeySelective(Logistics record);

    int updateByPrimaryKey(Logistics record);
}