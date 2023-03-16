package com.letg.design_mode.structural.bridge;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/13 16:31
 * @Description:
 */


public class GreenColor implements Color{
  @Override
  public void drawColor() {
    System.out.println("draw::Green");
  }
}
