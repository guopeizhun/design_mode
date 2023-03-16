package com.letg.design_mode.structural.flyweight;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/14 10:51
 * @Description:
 */


public class MysqlConnector implements Connector{
    @Override
    public void connect() {
        System.out.println("Connect to Mysql");
    }
}
