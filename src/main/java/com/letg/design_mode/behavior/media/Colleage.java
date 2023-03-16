package com.letg.design_mode.behavior.media;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/15 17:17
 * @Description:
 */


public abstract class Colleage {
    protected Mediator mediator;
    public Colleage(Mediator mediator){
        this.mediator = mediator;
    }
    void sendMsg(String msg,Colleage colleage){
        mediator.sendMsg(msg,colleage);
    }

    abstract void recieveMsg(String msg);

}
