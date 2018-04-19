package com.lu1ffy.springboot.service;

import com.lu1ffy.springboot.dao.BuildMapper;
import com.lu1ffy.springboot.model.Build;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * TODO Add class description here
 *
 * @author Luffy
 * @create 2018/4/19 9:29
 */
@Service
public class BuildService {

   @Autowired
   private BuildMapper buildMapper;


   public List<Build> getAll(){
      return buildMapper.findAll();
   }

}
