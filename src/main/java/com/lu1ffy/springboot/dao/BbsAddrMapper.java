package com.lu1ffy.springboot.dao;

import com.lu1ffy.springboot.model.BbsAddr;
import java.util.List;

public interface BbsAddrMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BbsAddr record);

    BbsAddr selectByPrimaryKey(Long id);

    List<BbsAddr> selectAll();

    int updateByPrimaryKey(BbsAddr record);
}