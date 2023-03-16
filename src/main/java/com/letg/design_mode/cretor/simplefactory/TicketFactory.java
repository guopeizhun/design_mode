package com.letg.design_mode.cretor.simplefactory;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/10 11:40
 * @Description:
 */


public class TicketFactory extends Factory{
  @Override
  public Ticket submitIdCard(String id) {
    ZooTicket zooTicket = new ZooTicket();
    zooTicket.setIdCard(id);
    return zooTicket;
  }
}
