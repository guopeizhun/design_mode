package com.letg.design_mode.cretor.simplefactory;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/10 11:25
 * @Description:
 */


public abstract class Factory {
    public Ticket createZooTicket(String idCard){
        Ticket ticket = submitIdCard(idCard);
        return ticket;
    }


    //提交身份证
    public abstract Ticket submitIdCard(String id);
}
