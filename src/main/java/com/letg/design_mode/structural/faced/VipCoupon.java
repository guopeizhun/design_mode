package com.letg.design_mode.structural.faced;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/13 14:49
 * @Description:
 */


public class VipCoupon implements Coupon{
    @Override
    public void use() {
        System.out.println("Vip user use Coupon");
    }
}
