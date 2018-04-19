package com.lu1ffy.springboot.dao;

import com.lu1ffy.springboot.model.BbsOrder;
import java.util.List;

public interface BbsOrderMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BbsOrder record);

    BbsOrder selectByPrimaryKey(Long id);

    List<BbsOrder> selectAll();

    int updateByPrimaryKey(BbsOrder record);
}