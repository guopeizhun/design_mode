package com.letg.design_mode.behavior.iterator;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/14 14:40
 * @Description:
 */


public class Person {
  private String username;
  private int age;
  public Person(String username,int age){
    this.username = username;
    this.age = age;
  }

  public String getUsername() {
    return username;
  }

  public int getAge() {
    return age;
  }
}
