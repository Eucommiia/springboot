package com.lu1ffy.springboot.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 用户实体类
 *
 * @author Luffy
 * @create 2018/3/16 13:32
 */
@Entity
@Table(name = "tb_user")
public class Person1 {

   @Id
   private Integer id;

   private String username;

   private String password;

   private String email;

   private String phone;

   private String rolename;

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public String getUsername() {
      return username;
   }

   public void setUsername(String username) {
      this.username = username;
   }

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getPhone() {
      return phone;
   }

   public void setPhone(String phone) {
      this.phone = phone;
   }

   public String getRolename() {
      return rolename;
   }

   public void setRolename(String rolename) {
      this.rolename = rolename;
   }

   @Override
   public String toString() {
      return "Person1{" + "id=" + id + ", username='" + username + '\'' + ", password='" + password
          + '\'' + ", email='" + email + '\'' + ", phone='" + phone + '\'' + ", rolename='"
          + rolename + '\'' + '}';
   }
}
