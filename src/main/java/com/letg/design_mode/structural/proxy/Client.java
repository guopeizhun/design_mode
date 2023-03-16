package com.letg.design_mode.structural.proxy;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/13 14:17
 * @Description:
 */


public class Client {
    public static void main(String[] args) {
        SubjectProxy proxy = new SubjectProxy();
        proxy.invoke();
    }
}
