package com.letg.design_mode.structural.adapter;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/13 11:09
 * @Description:oracle连接类
 */


public class MysqlDatabaseConnector {
   void connnectToMysql(String host,String port,String username,String password){
      System.out.println("MysqlDatabase connected");
   }
}
