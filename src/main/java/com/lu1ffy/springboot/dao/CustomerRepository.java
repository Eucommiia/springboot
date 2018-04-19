package com.lu1ffy.springboot.dao;

import com.lu1ffy.springboot.model.Build;
import com.lu1ffy.springboot.model.Person1;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * TODO Add class description here
 *
 * @author Luffy
 * @create 2018/4/17 17:26
 */
@Mapper
public interface CustomerRepository extends JpaRepository<Build,Long> {
   //List<Person1> findByPhone(String phone);

}
