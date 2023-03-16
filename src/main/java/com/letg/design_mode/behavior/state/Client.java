package com.letg.design_mode.behavior.state;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/15 11:03
 * @Description:
 */


public class Client {
  public static void main(String[] args) {
    Context context = new Context(new State1());
    context.request();
    context.setState(new State2());
    context.request();
  }
}
