package com.letg.design_mode;

import java.util.function.Function;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/6 15:15
 * @Description:
 */


public class Utils {
    public static void calculateAndInvoke(MyFunction func){
        long start = System.currentTimeMillis();
        func.apply();
        System.out.print(String.format("\n用例共用时：%sms\n",(System.currentTimeMillis()-start)));
    }
}


