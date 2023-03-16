package com.letg.design_mode.behavior.template;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/14 13:43
 * @Description:
 */


public abstract class Bank {
  void withdrawMoney(){
    operate1();
    operate2();
    operate3();
  }
  abstract void operate1();
  abstract void operate2();
  abstract void operate3();
}
