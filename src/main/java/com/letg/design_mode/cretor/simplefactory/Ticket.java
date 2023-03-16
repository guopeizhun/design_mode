package com.letg.design_mode.cretor.simplefactory;

import java.util.List;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/10 11:32
 * @Description:
 */


public abstract class Ticket {
  private String idCard;

  public String getIdCard() {
    return idCard;
  }

  public void setIdCard(String idCard) {
    this.idCard = idCard;
  }

  public abstract String getTicketName();

  public abstract void use();
}
