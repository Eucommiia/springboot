package com.lu1ffy.springboot.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TODO Add class description here
 *
 * @author Luffy
 * @create 2018/4/19 8:43
 */
@Entity
@Table(name = "build")
public class Build {

   @Id
   private Integer id;
   private String type;
   private String city;
   private String name;
   private String project;
   private Date time;
   private String keshou;
   private String yishou;
   private String karea;
   private String yarea;

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public String getType() {
      return type;
   }

   public void setType(String type) {
      this.type = type;
   }

   public String getCity() {
      return city;
   }

   public void setCity(String city) {
      this.city = city;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getProject() {
      return project;
   }

   public void setProject(String project) {
      this.project = project;
   }

   public Date getTime() {
      return time;
   }

   public void setTime(Date time) {
      this.time = time;
   }

   public String getKeshou() {
      return keshou;
   }

   public void setKeshou(String keshou) {
      this.keshou = keshou;
   }

   public String getYishou() {
      return yishou;
   }

   public void setYishou(String yishou) {
      this.yishou = yishou;
   }

   public String getKarea() {
      return karea;
   }

   public void setKarea(String karea) {
      this.karea = karea;
   }

   public String getYarea() {
      return yarea;
   }

   public void setYarea(String yarea) {
      this.yarea = yarea;
   }

   @Override
   public String toString() {
      return "Build{" + "id=" + id + ", type='" + type + '\'' + ", city='" + city + '\''
          + ", name='" + name + '\'' + ", project='" + project + '\'' + ", time=" + time
          + ", keshou='" + keshou + '\'' + ", yishou='" + yishou + '\'' + ", karea='" + karea + '\''
          + ", yarea='" + yarea + '\'' + '}';
   }
}
