package com.letg.design_mode.structural.decorator;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/13 13:36
 * @Description:权限拦截修饰器
 */


public class AuthDecorator implements Controller {
    private Controller controller;

    public AuthDecorator(Controller controller) {
        this.controller = controller;
    }


    @Override
    public void get() {
        System.out.println("进行权限拦截");
        controller.get();
    }
}
