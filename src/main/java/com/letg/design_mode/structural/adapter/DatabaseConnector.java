package com.letg.design_mode.structural.adapter;

import java.util.stream.Stream;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/13 11:06
 * @Description:数据库连接抽象类
 */


public interface DatabaseConnector {
   void connect(String url,String username,String password);
}
