package com.lu1ffy.springboot.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.lu1ffy.springboot.dao.CustomerRepository;
import com.lu1ffy.springboot.model.Build;
import com.lu1ffy.springboot.model.Person1;
import com.lu1ffy.springboot.service.BuildService;
import com.lu1ffy.springboot.service.TestService;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO Add class description here
 *
 * @author Luffy
 * @create 2018/4/16 11:28
 */
//@CrossOrigin(origins = "http://192.168.3.91:8082", maxAge = 3600)
@RestController
public class TestController {


   @Autowired
   private TestService testService;

   @Autowired
   private BuildService buildService;

   @Autowired
   private CustomerRepository customerRepository;

   @RequestMapping(value = "/test")
   public List<Person1> getAllLIst(@RequestParam("pageNum") int pageNum,
       @RequestParam("pageSize") int pageSize) {
      List<Person1> all = testService.getAll(pageNum, pageSize);
      return all;
   }

   @RequestMapping(value = "/update")
   public int update() {
      Person1 person1 = new Person1();
      person1.setId(6);
      person1.setUsername("Lu1FFy");
      int i = testService.editPerson(person1);
      return i;
   }

   @RequestMapping(value = "get")
   public List<Person1> get() {
      Person1 person = new Person1();
      person.setId(1);
      List<Person1> person1s = testService.get(person);
      return person1s;
   }

//   @RequestMapping(value = "insert")
//   public void index(){
//      Person1 person1 = new Person1();
//      person1.setId(9);
//      person1.setUsername("王五");
//      person1.setPassword("223");
//      customerRepository.save(person1);
//   }
//
//   @RequestMapping(value = "findByPhone")
//   public void  phone(){
//      List<Person1> byPhone = customerRepository.findByPhone("1");
//      System.out.println(byPhone);
//   }

   /***
    * DataV测试
    *
    * @param request
    * @return
    */
   @GetMapping(value = "/api/test")
   public List<Build> getAll(HttpServletRequest request) {
      JSONObject json = new JSONObject();
      List<Build> all = buildService.getAll();
      if (all.size() <= 0) {
         json.put("code", "201");
         json.put("data", "");
         json.put("message", "没有数据响应");
      }
      return all;
   }
}
