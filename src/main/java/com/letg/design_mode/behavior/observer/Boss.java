package com.letg.design_mode.behavior.observer;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/14 14:02
 * @Description:
 */


public class Boss {
    private String name;
    public Boss(String name){
        this.name = name;
    }
    void getNotify(String name,String work){
        System.out.println(this.name+"观察到了"+name+"完成了"+work);
    }
}
