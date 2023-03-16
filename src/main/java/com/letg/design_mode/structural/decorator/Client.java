package com.letg.design_mode.structural.decorator;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/13 13:38
 * @Description:
 */


public class Client {
  public static void main(String[] args) {
    AuthDecorator decorator = new AuthDecorator(new ControllerImpl());
    decorator.get();
  }
}
