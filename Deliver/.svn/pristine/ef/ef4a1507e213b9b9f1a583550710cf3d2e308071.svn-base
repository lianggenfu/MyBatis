package com.etc.dao;

import com.etc.entity.Courier;
import com.etc.entity.CourierExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface CourierMapper {
    int countByExample(CourierExample example);

    int deleteByExample(CourierExample example);

    int deleteByPrimaryKey(Integer cuid);

    int insert(Courier record);

    int insertSelective(Courier record);

    List<Courier> selectByExample(CourierExample example);

    Courier selectByPrimaryKey(Integer cuid);

    int updateByExampleSelective(@Param("record") Courier record, @Param("example") CourierExample example);

    int updateByExample(@Param("record") Courier record, @Param("example") CourierExample example);

    int updateByPrimaryKeySelective(Courier record);

    int updateByPrimaryKey(Courier record);

	List<Map<String, Object>> selectmap();
}