package com.letg.design_mode.structural.adapter;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/13 11:16
 * @Description:
 */


public class OracleDatabaseAdapter implements DatabaseConnector{

    private OracleDatabaseConnector connector;

    public OracleDatabaseAdapter(OracleDatabaseConnector connector){
        this.connector = connector;
    }
    @Override
    public void connect(String url, String username, String password) {
        String[] strings = url.split(":");
        connector.connnectToOracle(strings[0],strings[1],strings[2],username,password);
    }
}
