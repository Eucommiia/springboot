package com.lu1ffy.springboot.dao;

import com.lu1ffy.springboot.model.Class;
import java.util.List;

public interface ClassMapper {
    int deleteByPrimaryKey(Integer cId);

    int insert(Class record);

    Class selectByPrimaryKey(Integer cId);

    List<Class> selectAll();

    int updateByPrimaryKey(Class record);
}