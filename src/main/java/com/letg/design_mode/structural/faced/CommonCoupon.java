package com.letg.design_mode.structural.faced;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/13 14:48
 * @Description:
 */


public class CommonCoupon implements Coupon{
  @Override
  public void use() {
    System.out.println("Common user use Coupon");
  }
}
