package com.letg.design_mode.structural.flyweight;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/14 10:55
 * @Description:
 */


public class Client {
  public static void main(String[] args) {
    FlyWeight flyWeight = new FlyWeight();
    Connector mysql1 = flyWeight.getConnnect("mysql");
    System.out.println(mysql1);
    Connector mysql2 = flyWeight.getConnnect("mysql");
    System.out.println(mysql2);
    System.out.println(mysql1 == mysql2);
  }
}
