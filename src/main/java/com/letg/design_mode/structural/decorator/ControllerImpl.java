package com.letg.design_mode.structural.decorator;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/13 13:35
 * @Description:
 */


public class ControllerImpl implements Controller{
  @Override
  public void get() {
    System.out.println("You get the resource!!!");
  }
}
