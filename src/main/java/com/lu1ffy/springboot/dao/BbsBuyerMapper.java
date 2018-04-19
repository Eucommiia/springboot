package com.lu1ffy.springboot.dao;

import com.lu1ffy.springboot.model.BbsBuyer;
import java.util.List;

public interface BbsBuyerMapper {
    int deleteByPrimaryKey(String username);

    int insert(BbsBuyer record);

    BbsBuyer selectByPrimaryKey(String username);

    List<BbsBuyer> selectAll();

    int updateByPrimaryKey(BbsBuyer record);
}