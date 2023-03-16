package com.letg.design_mode.structural.adapter;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/13 11:16
 * @Description:
 */


public class MysqlDatabaseAdapter implements DatabaseConnector{

    private MysqlDatabaseConnector connector;

    public MysqlDatabaseAdapter(MysqlDatabaseConnector connector){
        this.connector = connector;
    }
    @Override
    public void connect(String url, String username, String password) {
        String[] strings = url.split(":");
        connector.connnectToMysql(strings[0],strings[1],username,password);
    }
}
