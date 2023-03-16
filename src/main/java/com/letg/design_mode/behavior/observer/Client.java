package com.letg.design_mode.behavior.observer;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/14 14:07
 * @Description:
 */


public class Client {
  public static void main(String[] args) {
    Employee tom = new Employee("Tom");
    tom.addObsever(new Boss("Candy"));
    tom.addObsever(new Boss("Marry"));
    tom.submitWork();
  }
}
