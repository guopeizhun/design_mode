package com.letg.design_mode.structural.adapter;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/13 11:23
 * @Description:
 */


public class Client {
  public static void main(String[] args) {
//    MysqlDatabaseAdapter adapter = new MysqlDatabaseAdapter(new MysqlDatabaseConnector());
    OracleDatabaseAdapter adapter1 = new OracleDatabaseAdapter(new OracleDatabaseConnector());
//    adapter.connect("jdbc:mysql://localhost:3306","root","123456");
    adapter1.connect("jdbc:oracle:thin:@localhost:1521","root","123456");
  }
}
