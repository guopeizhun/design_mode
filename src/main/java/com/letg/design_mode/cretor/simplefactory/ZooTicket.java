package com.letg.design_mode.cretor.simplefactory;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/10 11:36
 * @Description:
 */


public class ZooTicket extends Ticket{
    @Override
    public String getTicketName() {
        return "ZooTicket";
    }

    @Override
    public void use() {
        System.out.println(this.getIdCard()+"在使用"+this.getTicketName());
    }
}
