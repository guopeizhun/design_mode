package com.letg.design_mode.structural.proxy;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/13 14:14
 * @Description:真实主题
 */


public class RealSubject implements Subject{
    @Override
    public void invoke() {
        System.out.println("Invoke the method");
    }
}
