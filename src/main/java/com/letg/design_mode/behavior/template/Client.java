package com.letg.design_mode.behavior.template;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/14 13:45
 * @Description:
 */


public class Client {
  public static void main(String[] args) {
    Bank bank = new BankImpl();
    bank.withdrawMoney();
  }
}
