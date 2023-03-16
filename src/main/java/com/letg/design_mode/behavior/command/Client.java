package com.letg.design_mode.behavior.command;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/14 15:49
 * @Description:
 */


public class Client {
  public static void main(String[] args) {
    DbControl dbControl = new DbControl();
    Db db = new Db();
    dbControl.put(0,new UpdateCommand(db));
    dbControl.sendCommand(0);

  }
}
