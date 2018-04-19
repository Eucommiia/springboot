package com.lu1ffy.springboot.dao;

import com.lu1ffy.springboot.model.BbsProduct;
import java.util.List;

public interface BbsProductMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BbsProduct record);

    BbsProduct selectByPrimaryKey(Long id);

    List<BbsProduct> selectAll();

    int updateByPrimaryKey(BbsProduct record);
}