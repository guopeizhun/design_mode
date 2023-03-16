package com.letg.design_mode.behavior.media;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/15 17:22
 * @Description:
 */


public class Client {
  public static void main(String[] args) {
    MediatorImpl mediator = new MediatorImpl();
    ColleageA colleageA = new ColleageA(mediator);
    ColleageB colleageB = new ColleageB(mediator);
    mediator.setColleageA(colleageA);
    mediator.setColleageB(colleageB);

    colleageA.sendMsg("你好，B同事，我是A同事",colleageB);

  }
}
