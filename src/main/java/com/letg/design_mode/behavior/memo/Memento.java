package com.letg.design_mode.behavior.memo;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/15 9:55
 * @Description:
 */


public class Memento {
    private String state;
    public Memento(String state){
        this.state = state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    @Override
    public String toString() {
     return "备忘录的状态为:"+state;
    }
}
