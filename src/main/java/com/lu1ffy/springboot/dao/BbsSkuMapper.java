package com.lu1ffy.springboot.dao;

import com.lu1ffy.springboot.model.BbsSku;
import java.util.List;

public interface BbsSkuMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BbsSku record);

    BbsSku selectByPrimaryKey(Long id);

    List<BbsSku> selectAll();

    int updateByPrimaryKey(BbsSku record);
}