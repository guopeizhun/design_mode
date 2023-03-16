package com.letg.design_mode.behavior.media;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/15 17:18
 * @Description:
 */


public class MediatorImpl implements Mediator{

    private Colleage colleageA;
    private Colleage colleageB;

    @Override
    public void sendMsg(String msg, Colleage colleage) {
        colleage.recieveMsg(msg);
    }

    public void setColleageA(Colleage colleageA) {
        this.colleageA = colleageA;
    }

    public void setColleageB(Colleage colleageB) {
        this.colleageB = colleageB;
    }
}
