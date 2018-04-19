package com.lu1ffy.springboot.dao;

import com.lu1ffy.springboot.model.Person1;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

/**
 * TODO Add class description here
 *
 * @author Luffy
 * @create 2018/4/8 15:48
 */
@Mapper
public interface Person1Mapper {

   List<Person1> queryAll();

   List<Person1> queryList();

   int insertInto(Person1 person);

   int updateDate(Person1 person);

   List<Person1> getListByLimit();

   List<Person1> query(int[] ids);

}
