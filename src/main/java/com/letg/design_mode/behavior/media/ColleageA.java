package com.letg.design_mode.behavior.media;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/15 17:19
 * @Description:
 */


public class ColleageA extends Colleage{
    public ColleageA(Mediator mediator) {
        super(mediator);
    }

    @Override
    void recieveMsg(String msg) {
        System.out.println("ColleageA receieve "+ msg);
    }
}
