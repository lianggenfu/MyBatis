package com.etc.dao;

import com.etc.entity.Accessinfo;
import com.etc.entity.AccessinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccessinfoMapper {
    int countByExample(AccessinfoExample example);

    int deleteByExample(AccessinfoExample example);

    int deleteByPrimaryKey(Integer acid);

    int insert(Accessinfo record);

    int insertSelective(Accessinfo record);

    List<Accessinfo> selectByExample(AccessinfoExample example);

    Accessinfo selectByPrimaryKey(Integer acid);

    int updateByExampleSelective(@Param("record") Accessinfo record, @Param("example") AccessinfoExample example);

    int updateByExample(@Param("record") Accessinfo record, @Param("example") AccessinfoExample example);

    int updateByPrimaryKeySelective(Accessinfo record);

    int updateByPrimaryKey(Accessinfo record);
}