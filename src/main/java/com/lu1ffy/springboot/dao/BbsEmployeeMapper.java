package com.lu1ffy.springboot.dao;

import com.lu1ffy.springboot.model.BbsEmployee;
import java.util.List;

public interface BbsEmployeeMapper {
    int deleteByPrimaryKey(String username);

    int insert(BbsEmployee record);

    BbsEmployee selectByPrimaryKey(String username);

    List<BbsEmployee> selectAll();

    int updateByPrimaryKey(BbsEmployee record);
}