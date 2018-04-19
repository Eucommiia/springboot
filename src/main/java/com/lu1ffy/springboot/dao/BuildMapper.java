package com.lu1ffy.springboot.dao;

import com.lu1ffy.springboot.model.Build;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

/**
 * TODO Add class description here
 *
 * @author Luffy
 * @create 2018/4/19 9:15
 */
@Mapper
public interface BuildMapper {
   List<Build> findAll();
}
