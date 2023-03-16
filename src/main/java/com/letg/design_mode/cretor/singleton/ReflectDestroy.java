package com.letg.design_mode.cretor.singleton;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/6 16:40
 * @Description:反射破坏单例模式
 */


public class ReflectDestroy {

    @Test
    public void hungryDestory() throws Exception {
        Class<HungrySingleton> clazz = HungrySingleton.class;
        Constructor<HungrySingleton> constructor = clazz.getDeclaredConstructor();
        //使构造方法范围变为public
        constructor.setAccessible(true);
        HungrySingleton hungrySingleton = constructor.newInstance();
        System.out.println(hungrySingleton);
        System.out.println(HungrySingleton.createInstance());
    }

    @Test
    public void lasyDestory() throws Exception {
        Class<LasySingleton> clazz = LasySingleton.class;
        Constructor<LasySingleton> constructor = clazz.getDeclaredConstructor();
        //使构造方法范围变为public
        constructor.setAccessible(true);
        LasySingleton lasySingleton = constructor.newInstance();
        System.out.println(LasySingleton.createInstance());
        System.out.println(lasySingleton);
    }


}
