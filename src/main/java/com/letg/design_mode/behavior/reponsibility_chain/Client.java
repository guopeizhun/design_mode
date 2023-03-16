package com.letg.design_mode.behavior.reponsibility_chain;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/14 15:10
 * @Description:
 */


public class Client {
  public static void main(String[] args) {
    Handler handler = new AuthHandler().addHandler(new LogHandler());
    Request request = new HttpRequest(handler);
    request.progress();

  }
}
