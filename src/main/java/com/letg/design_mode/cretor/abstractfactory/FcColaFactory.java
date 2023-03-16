package com.letg.design_mode.cretor.abstractfactory;

import com.letg.design_mode.cretor.abstractfactory.cola.*;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/10 10:38
 * @Description:
 */


public class FcColaFactory implements ColaFactory{
    @Override
    public Cola createCola(String type) {
        if(type.equals("DietCola")){
            return new FcDietCola();
        }else if(type.equals("CherryCola")){
            return new FcCherryCola();
        }
        return null;
    }
}
