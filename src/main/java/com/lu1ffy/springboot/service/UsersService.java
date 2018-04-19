package com.lu1ffy.springboot.service;

import com.lu1ffy.springboot.dao.UsersMapper;
import com.lu1ffy.springboot.model.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * TODO Add class description here
 *
 * @author Luffy
 * @create 2018/4/16 17:38
 */
@Service
public class UsersService {

   @Autowired
   private UsersMapper usersMapper;

   public UserEntity getUsername(String username,String password){
      return usersMapper.loginByUsername(username,password);
   }
}
