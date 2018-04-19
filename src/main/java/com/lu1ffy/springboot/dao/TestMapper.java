package com.lu1ffy.springboot.dao;

import com.lu1ffy.springboot.common.MyMapper;
import com.lu1ffy.springboot.model.Person1;
import org.apache.ibatis.annotations.Mapper;

/**
 * TODO Add class description here
 *
 * @author Luffy
 * @create 2018/4/16 11:16
 */
@Mapper
public interface TestMapper extends MyMapper<Person1> {
   //List<Person1> findAll();
}
