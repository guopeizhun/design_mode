package com.letg.design_mode.behavior.state;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/15 11:02
 * @Description:
 */


public class Context {
  private State state;
  public Context(State state){
    this.state = state;
  }

  void request(){
    state.handle();
  }

  public void setState(State state) {
    this.state = state;
  }
}
