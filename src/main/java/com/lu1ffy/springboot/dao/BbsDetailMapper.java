package com.lu1ffy.springboot.dao;

import com.lu1ffy.springboot.model.BbsDetail;
import java.util.List;

public interface BbsDetailMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BbsDetail record);

    BbsDetail selectByPrimaryKey(Long id);

    List<BbsDetail> selectAll();

    int updateByPrimaryKey(BbsDetail record);
}