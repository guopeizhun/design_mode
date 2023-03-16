package com.letg.design_mode.behavior.iterator;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/14 14:44
 * @Description:
 */


public class Client {
  public static void main(String[] args) {
    PersonList personList = new PersonList();
    personList.add(new Person("Alice", 20));
    personList.add(new Person("Bob", 30));
    personList.add(new Person("Charlie", 40));
    //迭代子对象
    for (Person person : personList) {
      System.out.println(person.getUsername()+"今年"+person.getAge());
    }
  }
}
