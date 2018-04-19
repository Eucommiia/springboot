package com.lu1ffy.springboot.controller;

import com.alibaba.fastjson.JSONObject;
import com.lu1ffy.springboot.model.UserEntity;
import com.lu1ffy.springboot.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO Add class description here
 *
 * @author Luffy
 * @create 2018/4/16 17:11
 */
@RestController
public class HtmlController {

   @Autowired
   private UsersService usersService;

   @RequestMapping(value = "/index")
   private String toIndex() {
      return "/index";
   }

   @RequestMapping(value = "/login")
   public JSONObject user(@RequestParam(value = "username", required = false) String username,
       @RequestParam(value = "password", required = false) String password) {
      System.out.println(username + "-------" + password);
      UserEntity user = usersService.getUsername(username, password);
      JSONObject json = new JSONObject();
      if (user != null) {
         json.put("code", 200);
         json.put("data", user);
         json.put("message", "success");
      } else {
         json.put("code", 201);
         json.put("data", "");
         json.put("message", "用户名或密码错误");
      }
      return json;
   }
}
