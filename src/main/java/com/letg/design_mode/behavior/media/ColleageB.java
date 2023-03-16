package com.letg.design_mode.behavior.media;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/15 17:22
 * @Description:
 */


public class ColleageB extends Colleage{

  public ColleageB(Mediator mediator) {
    super(mediator);
  }

  @Override
  void recieveMsg(String msg) {
    System.out.println("ColleageB receieve "+ msg);
  }
}
