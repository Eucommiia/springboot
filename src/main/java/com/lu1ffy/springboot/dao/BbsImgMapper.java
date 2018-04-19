package com.lu1ffy.springboot.dao;

import com.lu1ffy.springboot.model.BbsImg;
import java.util.List;

public interface BbsImgMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BbsImg record);

    BbsImg selectByPrimaryKey(Long id);

    List<BbsImg> selectAll();

    int updateByPrimaryKey(BbsImg record);
}