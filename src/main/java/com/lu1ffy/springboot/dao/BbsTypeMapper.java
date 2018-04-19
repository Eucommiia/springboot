package com.lu1ffy.springboot.dao;

import com.lu1ffy.springboot.model.BbsType;
import java.util.List;

public interface BbsTypeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BbsType record);

    BbsType selectByPrimaryKey(Long id);

    List<BbsType> selectAll();

    int updateByPrimaryKey(BbsType record);
}