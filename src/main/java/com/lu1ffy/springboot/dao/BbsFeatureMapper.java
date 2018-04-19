package com.lu1ffy.springboot.dao;

import com.lu1ffy.springboot.model.BbsFeature;
import java.util.List;

public interface BbsFeatureMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BbsFeature record);

    BbsFeature selectByPrimaryKey(Long id);

    List<BbsFeature> selectAll();

    int updateByPrimaryKey(BbsFeature record);
}