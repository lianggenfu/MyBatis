package com.etc.dao;

import com.etc.entity.Branch;
import com.etc.entity.BranchExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BranchMapper {
    int countByExample(BranchExample example);

    int deleteByExample(BranchExample example);

    int deleteByPrimaryKey(Integer beachid);

    int insert(Branch record);

    int insertSelective(Branch record);

    List<Branch> selectByExample(BranchExample example);

    Branch selectByPrimaryKey(Integer beachid);

    int updateByExampleSelective(@Param("record") Branch record, @Param("example") BranchExample example);

    int updateByExample(@Param("record") Branch record, @Param("example") BranchExample example);

    int updateByPrimaryKeySelective(Branch record);

    int updateByPrimaryKey(Branch record);
}