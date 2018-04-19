package com.lu1ffy.springboot.dao;

import com.lu1ffy.springboot.model.BbsBrand;
import java.util.List;

public interface BbsBrandMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BbsBrand record);

    BbsBrand selectByPrimaryKey(Long id);

    List<BbsBrand> selectAll();

    int updateByPrimaryKey(BbsBrand record);
}