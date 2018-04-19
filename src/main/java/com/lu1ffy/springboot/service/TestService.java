package com.lu1ffy.springboot.service;

import com.github.pagehelper.PageHelper;
import com.lu1ffy.springboot.dao.TestMapper;
import com.lu1ffy.springboot.model.Person1;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;

/**
 * TODO Add class description here
 *
 * @author Luffy
 * @create 2018/4/16 11:23
 */
@Service
public class TestService {

   @Autowired
   private TestMapper testMapper;

   public List<Person1> getAll(int pageNum, int pageSize) {
      Example example = new Example(Person1.class);
      example.setOrderByClause("phone desc");
      PageHelper.startPage(pageNum, pageSize);
      List<Person1> all = testMapper.selectByExample(example);
      return all;
   }

   public int editPerson(Person1 person1) {
      return testMapper.updateByPrimaryKeySelective(person1);
   }

   public List<Person1> get(Person1 person1){
      Example example = new Example(Person1.class);
      Criteria criteria = example.createCriteria();
      // criteria.andEqualTo("id", 1);
      criteria.andNotEqualTo("id", 1);
      List<Person1> person1s = testMapper.selectByExample(example);
      return person1s;
   }


}
