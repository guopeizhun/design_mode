package com.letg.design_mode.cretor.singleton;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/6 15:04
 * @Description:懒汉模式
 */


public class LasySingleton {
    private volatile  static LasySingleton singleton;

    private LasySingleton() {
        if(null != singleton){
            throw new RuntimeException("单例已经存在");
        }
    }

    /**
     * 同步方法实现懒汉单例模式
     *
     * @return
     */
    public static synchronized LasySingleton createInstance() {
        if (null == singleton) {
            singleton = new LasySingleton();
        }
        return singleton;
    }

    /**
     * DDL实现懒汉单例模式
     *
     * @return
     */

    public static LasySingleton createInstanceByDDL() {
        if (null == singleton) {
            synchronized (LasySingleton.class) {
                if (null == singleton) {
                    singleton = new LasySingleton();
                }
            }
        }
        return singleton;
    }
}
