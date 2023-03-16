package com.letg.design_mode.behavior.reponsibility_chain;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/14 15:02
 * @Description:
 */


public abstract class Handler {
  protected Handler next;
  public Handler(){}

  abstract boolean handle();

  Handler addHandler(Handler next){
    this.next = next;
    return this;
  }
}
