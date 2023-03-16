package com.letg.design_mode.behavior.memo;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/15 9:58
 * @Description:
 */


public class Originator {
    private String state;

    public Originator(String state) {
        this.state = state;
    }

    public Memento saveToMemento() {
        return new Memento(state);
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
