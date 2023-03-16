package com.letg.design_mode.structural.combined;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/14 10:34
 * @Description:
 */


public class Leaf implements Component{
    private String name;
    public Leaf(String name){
        this.name = name;
    }
    @Override
    public void operate() {
        System.out.println(name+">>>operate.....");
    }
}
