package com.letg.design_mode.structural.proxy;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/13 14:15
 * @Description:真实主题代理对象
 */


public class SubjectProxy implements Subject {
    private final RealSubject realSubject;

    public SubjectProxy() {
        realSubject = new RealSubject();
    }


    @Override
    public void invoke() {
        System.out.println("Do something before invoke");
        realSubject.invoke();
        System.out.println("Do something after invoke");
    }
}
