package com.lu1ffy.springboot.dao;

import com.lu1ffy.springboot.model.UserEntity;
import com.lu1ffy.springboot.model.Users;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UsersMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Users record);

    Users selectByPrimaryKey(Long id);

    List<Users> selectAll();

    int updateByPrimaryKey(Users record);

   UserEntity loginByUsername(@Param("username") String username,@Param("password") String password);
}