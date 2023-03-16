package com.letg.design_mode.structural.faced;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/13 14:51
 * @Description:使用优惠券外观类
 */


public class UseCoupon {
    private final CommonCoupon commonCoupon;
    private final VipCoupon vipCoupon;

    public UseCoupon() {
        commonCoupon = new CommonCoupon();
        vipCoupon = new VipCoupon();
    }

    public void vipUse(){
        vipCoupon.use();
    }

    public void commonUse(){
        commonCoupon.use();
    }

}
