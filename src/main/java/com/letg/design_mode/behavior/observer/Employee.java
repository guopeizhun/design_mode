package com.letg.design_mode.behavior.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/14 14:01
 * @Description:
 */


public class Employee {
  private  List<Boss> bossList;
  private String name;

  public Employee(String name){
    this.name = name;
    this.bossList = new ArrayList<>();
  }
  void submitWork(){
    System.out.println("submitWork");
    for (Boss boss : bossList) {
      boss.getNotify(name,"work");
    }
  }
  public void addObsever(Boss boss){
    if(!bossList.contains(boss)){
      bossList.add(boss);
    }
  }
}
