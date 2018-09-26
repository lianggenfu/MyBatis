package com.etc.dao;

import com.etc.entity.Claim;
import com.etc.entity.ClaimExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClaimMapper {
    int countByExample(ClaimExample example);

    int deleteByExample(ClaimExample example);

    int deleteByPrimaryKey(Integer deliveryid);

    int insert(Claim record);

    int insertSelective(Claim record);

    List<Claim> selectByExample(ClaimExample example);

    Claim selectByPrimaryKey(Integer deliveryid);

    int updateByExampleSelective(@Param("record") Claim record, @Param("example") ClaimExample example);

    int updateByExample(@Param("record") Claim record, @Param("example") ClaimExample example);

    int updateByPrimaryKeySelective(Claim record);

    int updateByPrimaryKey(Claim record);
}