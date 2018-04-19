package com.lu1ffy.springboot.controller;

import com.alibaba.fastjson.JSONObject;
import com.lu1ffy.springboot.dao.UserRep;
import com.lu1ffy.springboot.model.Person1;
import com.lu1ffy.springboot.service.PersonService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * springboot案例入门
 *
 * @author Luffy
 * @create 2018/4/8 15:02
 */

@RestController
public class SpringBootTest {

   private Logger logger = LoggerFactory.getLogger(SpringBootTest.class);

   @Autowired
   private PersonService personService;

   @Autowired
   private UserRep userRep;


   @ApiOperation(value = "第一个springboot案例",notes = "Lu1Ffy")
   @RequestMapping(value = "/demo")
   public String test() {
      return "ＨＥＬＬＯ　Ｌｕ１ＦＦｙ";
   }


   @ApiOperation(value="获取所有用户", notes="用户集合")
   @ApiImplicitParam(name = "Person1", value = "用户详细实体Person1", dataType = "Person1")
   @RequestMapping(value = "/api")
   public JSONObject getAll() {
      JSONObject json = new JSONObject();
      List<Person1> list = personService.getAllUser();
      json.put("code", 200);
      json.put("data", list);
      json.put("message", "suceess");
      return json;
   }

   @RequestMapping(value = "/a")
   public List<Person1> getAllPerson() {
      List<Person1> list = personService.getAll();
      return list;
   }

   @RequestMapping(value = "/b")
   public List<Person1> getAllUser() {
      List<Person1> list = userRep.findAll(new Sort(Direction.DESC, "phone"));
      return list;
   }


   @RequestMapping(value = "/c")
   public List<Person1> getAllList() {
      List<Person1> allList = personService.getAllList();
      return allList;
   }

   @RequestMapping(value = "/d")
   public void insertData() {
      Person1 p = new Person1();
      p.setId(6);
      p.setUsername("张三");
      p.setPassword("1234");
      p.setEmail("ql@qq.com");
      p.setPhone("1234");
      p.setRolename("Lu1ffy");
      personService.insertData(p);
   }

   @GetMapping(value = "/e/{id}")
   public int update(@PathVariable("id") Integer id) {
      Person1 p = new Person1();
      p.setId(id);
      System.out.println(id);
      p.setUsername("llllll");
      p.setPhone("1008611");
      int update = personService.update(p);
      if (update > 0) {
         System.out.println("更新成功");
      } else {
         System.out.println("更新失败");
      }
      return update;
   }

   @RequestMapping(value = "/all")
   public Object findAllUser(@RequestParam("pageNum") int pageNum,
       @RequestParam("pageSize") int pageSize) {
      System.out.println(pageNum + "-------------" + pageSize);
      return personService.getAllP(pageNum, pageSize);
   }

   @RequestMapping(value = "/query")
   public List<Person1> get(){
      int[] arr={1,2,3};
      List<Person1> query = personService.getQuery(arr);
      return  query;
   }

}
