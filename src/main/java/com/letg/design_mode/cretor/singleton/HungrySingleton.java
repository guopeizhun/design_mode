package com.letg.design_mode.cretor.singleton;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/6 16:33
 * @Description:饿汉模式
 */


public class HungrySingleton {
  private static HungrySingleton singleton = new HungrySingleton();

  private HungrySingleton(){
    if(null == singleton){

    }else {
      throw new RuntimeException("单例已经存在");
    }
  }

  public static HungrySingleton createInstance(){
    return singleton;
  }
}
