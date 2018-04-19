//package com.lu1ffy.springboot.model;
//
//import java.io.Serializable;
//import javax.persistence.CascadeType;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//
///**
// * TODO Add class description here
// *
// * @author Luffy
// * @create 2018/4/18 10:16
// */
//@Entity
//@Table(name = "book")
//public class Book implements Serializable {
//
//   /**
//    * @Table声明此对象映射到数据库的数据表，通过它可以为实体指定表(talbe),目录(Catalog)和schema的名字。该注释不是必须的，如果没有则系统使用默认值(实体的短类名)。
//    * @Id 声明此属性为主键。该属性值可以通过应该自身创建，但是Hibernate推荐通过Hibernate生成
//    * @GeneratedValue 指定主键的生成策略。
//    * TABLE：使用表保存id值
//    * IDENTITY：identitycolumn
//    * SEQUENCR ：sequence
//    * AUTO：根据数据库的不同使用上面三个
//    * @Column 声明该属性与数据库字段的映射关系。
//    * @OneToOne 一对一关联关系
//    * @JoinColumn 指定关联的字段
//    */
//   @Id
//   @GeneratedValue(strategy = GenerationType.AUTO)
//   private int id;
//   private String name;
//   /**
//    * 注解@OneToOne的属性：
//    * cascade:关联属性，这个属性定义了当前类对象操作了之后，级联对象的操作。本例中定义了：CascadeType.ALL，
//    * 当前类增删改查改变之后，关联类跟着增删改查。
//    * fetch属性：FetchType类型的属性。可选择项包括：FetchType.EAGER 和FetchType.LAZY。
//    * FetchType.EAGER表示关系类在主类加载的时候同时加载，FetchType.LAZY表示关系类在被访问时才加载。
//    * 默认值是FetchType.LAZY。
//    * mappedBy:拥有关联关系的域，如果关系是单向的就不需要，双向关系表，
//    * 那么拥有关系的这一方有建立、解除和更新与另一方关系的能力，而另一方没有，只能被动管理，
//    * 这个属性被定义在关系的被拥有方。双向@OneToOne，双向@OneToMany，双向@ManyToMany
//    */
//   @OneToOne(cascade = CascadeType.ALL, mappedBy = "book")
//   private BookDetail bookDetail;
//
//   public int getId() {
//      return id;
//   }
//
//   public void setId(int id) {
//      this.id = id;
//   }
//
//   public String getName() {
//      return name;
//   }
//
//   public void setName(String name) {
//      this.name = name;
//   }
//
//   public BookDetail getBookDetail() {
//      return bookDetail;
//   }
//
//   public void setBookDetail(BookDetail bookDetail) {
//      this.bookDetail = bookDetail;
//   }
//
//   @Override
//   public String toString() {
//      return "Book{" + "id=" + id + ", name='" + name + '\'' + ", bookDetail=" + bookDetail + '}';
//   }
//}
