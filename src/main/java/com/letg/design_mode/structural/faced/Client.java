package com.letg.design_mode.structural.faced;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/13 14:52
 * @Description:
 */


public class Client {
  public static void main(String[] args) {
    UseCoupon useCoupon = new UseCoupon();
    useCoupon.commonUse();
    useCoupon.vipUse();
  }
}
