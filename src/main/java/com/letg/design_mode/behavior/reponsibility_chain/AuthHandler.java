package com.letg.design_mode.behavior.reponsibility_chain;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/14 15:06
 * @Description:
 */


public class AuthHandler extends Handler{
    @Override
    boolean handle() {
        System.out.println("Unseccess Auth");
        return false;
    }
}
