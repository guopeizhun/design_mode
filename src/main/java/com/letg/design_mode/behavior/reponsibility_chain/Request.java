package com.letg.design_mode.behavior.reponsibility_chain;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/14 15:02
 * @Description:
 */


public abstract class Request {
    protected Handler head;

    public Request(Handler head) {
        this.head = head;
    }

    abstract void progress();
}
