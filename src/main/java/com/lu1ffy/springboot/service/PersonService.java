package com.lu1ffy.springboot.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lu1ffy.springboot.dao.Person1Mapper;
import com.lu1ffy.springboot.dao.UserRep;
import com.lu1ffy.springboot.model.Person;
import com.lu1ffy.springboot.model.Person1;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * TODO Add class description here
 *
 * @author Luffy
 * @create 2018/4/8 15:55
 */
@Service
public class PersonService {

   @Autowired
   private Person1Mapper personMapper;

   @Autowired
   private UserRep userRep;

   public List<Person1> getAllUser() {
      return personMapper.queryAll();
   }


   public List<Person1> getAll() {
      return userRep.findAll();
   }


   public List<Person1> getAllList() {
      return personMapper.queryList();
   }

   public void insertData(Person1 person) {
      personMapper.insertInto(person);
   }

   public int update(Person1 person) {
      return personMapper.updateDate(person);
   }

   public List<Person1> getAllP(int pageNum, int pageSize) {
      PageHelper.startPage(pageNum, pageSize);
      List<Person1> listByLimit = personMapper.getListByLimit();
      PageInfo<Person1> personPageInfo = new PageInfo<>(listByLimit);
      return listByLimit;
   }


   public List<Person1> getQuery(int[] ids){
      List<Person1> query = personMapper.query(ids);
      return query;
   }
}
