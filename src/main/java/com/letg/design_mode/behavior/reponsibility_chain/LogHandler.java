package com.letg.design_mode.behavior.reponsibility_chain;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/14 15:07
 * @Description:
 */


public class LogHandler extends Handler{
    @Override
    boolean handle() {
        System.out.println("Log Handle");
        return true;
    }
}
