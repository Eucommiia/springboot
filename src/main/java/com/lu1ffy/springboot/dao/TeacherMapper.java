package com.lu1ffy.springboot.dao;

import com.lu1ffy.springboot.model.Teacher;
import java.util.List;

public interface TeacherMapper {
    int deleteByPrimaryKey(Integer tId);

    int insert(Teacher record);

    Teacher selectByPrimaryKey(Integer tId);

    List<Teacher> selectAll();

    int updateByPrimaryKey(Teacher record);
}