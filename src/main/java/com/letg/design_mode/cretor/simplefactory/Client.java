package com.letg.design_mode.cretor.simplefactory;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/10 11:41
 * @Description:
 */


public class Client {
  public static void main(String[] args) {
    TicketFactory ticketFactory = new TicketFactory();
    Ticket ticket = ticketFactory.createZooTicket("123456");
    System.out.println("当前票->");
    System.out.println(ticket.getTicketName());
    System.out.println("当前用户idCard为->");
    System.out.println(ticket.getIdCard());
    ticket.use();
  }
}
