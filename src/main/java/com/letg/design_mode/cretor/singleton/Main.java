package com.letg.design_mode.cretor.singleton;

import com.letg.design_mode.MyFunction;
import com.letg.design_mode.Utils;
import org.junit.Test;

import javax.rmi.CORBA.Util;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/6 15:10
 * @Description:
 */


public class Main {
  /**
   * 同步方法懒汉模式的测试用例
   */
  @Test
  public void testLasy(){
      MyFunction func = ()->{
          for (int i = 0; i < 10; i++) {
              System.out.println(LasySingleton.createInstance());
          }
      };
      Utils.calculateAndInvoke(func);
    };

    /**
     * DDL懒汉模式测试用例
     */
    @Test
    public void testLasyDDL(){
        MyFunction func = ()->{
            for (int i = 0; i < 10000; i++) {
                System.out.println(LasySingleton.createInstanceByDDL());
            }
        };
        Utils.calculateAndInvoke(func);
    };





}
