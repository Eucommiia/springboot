package com.lu1ffy.springboot.dao;

import com.lu1ffy.springboot.model.Person1;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * TODO Add class description here
 *
 * @author Luffy
 * @create 2018/4/11 16:10
 */
public interface UserRep extends JpaRepository<Person1,Long>{



}
