package com.lu1ffy.springboot.dao;

import com.lu1ffy.springboot.model.BbsColor;
import java.util.List;

public interface BbsColorMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BbsColor record);

    BbsColor selectByPrimaryKey(Long id);

    List<BbsColor> selectAll();

    int updateByPrimaryKey(BbsColor record);
}