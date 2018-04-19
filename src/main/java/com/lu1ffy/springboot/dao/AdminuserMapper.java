package com.lu1ffy.springboot.dao;

import com.lu1ffy.springboot.model.Adminuser;
import java.util.List;

public interface AdminuserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Adminuser record);

    Adminuser selectByPrimaryKey(Integer id);

    List<Adminuser> selectAll();

    int updateByPrimaryKey(Adminuser record);
}