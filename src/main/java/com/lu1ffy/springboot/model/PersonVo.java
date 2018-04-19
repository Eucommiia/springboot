package com.lu1ffy.springboot.model;

/**
 * TODO Add class description here
 *
 * @author Luffy
 * @create 2018/4/12 9:41
 */
public class PersonVo {

   private String nickname;
   private String pass;

   public String getNickname() {
      return nickname;
   }

   public void setNickname(String nickname) {
      this.nickname = nickname;
   }

   public String getPass() {
      return pass;
   }

   public void setPass(String pass) {
      this.pass = pass;
   }

   @Override
   public String toString() {
      return "PersonVo{" + "nickname='" + nickname + '\'' + ", pass='" + pass + '\'' + '}';
   }
}
