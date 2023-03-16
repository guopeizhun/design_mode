package com.letg.design_mode.cretor.abstractfactory;

import com.letg.design_mode.cretor.abstractfactory.cola.Cola;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/10 10:26
 * @Description:
 */


public interface ColaFactory {
    public Cola createCola(String type);
}
