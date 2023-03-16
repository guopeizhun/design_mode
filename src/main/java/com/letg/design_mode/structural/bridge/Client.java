package com.letg.design_mode.structural.bridge;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/13 16:44
 * @Description:
 */


public class Client {
  public static void main(String[] args) {
    ShapeX shapeX = new ShapeX(new GreenColor());
    shapeX.drawShape();
  }
}
