package com.letg.design_mode.cretor.abstractfactory;

import com.letg.design_mode.cretor.abstractfactory.cola.Cola;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/10 10:46
 * @Description:
 */


public class Client {
  public static void main(String[] args) {
    CocoColaFactory cocoColaFactory = new CocoColaFactory();
    FcColaFactory fcColaFactory = new FcColaFactory();
    Cola cocoCola = cocoColaFactory.createCola("DietCola");
    Cola fcCola = fcColaFactory.createCola("DietCola");
    System.out.println(cocoCola.getName());
    System.out.println(fcCola.getName());

  }
}
