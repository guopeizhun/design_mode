package com.letg.design_mode.cretor.builder;

import java.util.HashMap;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/10 16:05
 * @Description:
 */


public class Client {
  public static void main(String[] args) {
    Instructor instructor = new Instructor();
    HttpRequest request = instructor.concreateReq(new HashMap<>(), "1234", "HTTP/1.1 GET /index.html");
    System.out.println(request);
  }
}
