package com.letg.design_mode.cretor.abstractfactory;

import com.letg.design_mode.cretor.abstractfactory.cola.CocoCherryCola;
import com.letg.design_mode.cretor.abstractfactory.cola.CocoDietCola;
import com.letg.design_mode.cretor.abstractfactory.cola.Cola;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/10 10:27
 * @Description:
 */


public class CocoColaFactory implements ColaFactory{
    @Override
    public Cola createCola(String type) {
        if(type.equals("DietCola")){
            return new CocoDietCola();
        }else if(type.equals("CherryCola")){
            return new CocoCherryCola();
        }
        return null;
    }
}
