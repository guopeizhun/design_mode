package com.letg.design_mode.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/14 10:53
 * @Description:
 */


public class FlyWeight {
  private final Map<String,Connector> connectorMap;
  public FlyWeight(){
    connectorMap = new HashMap<>();
  }

  public Connector getConnnect(String key){
    Connector connector = connectorMap.get(key);
    if(null == connector){
      if(key.equals("mysql")){
        connectorMap.put("mysql",new MysqlConnector());
      }else if(key.equals("oracle")){
        connectorMap.put("oracle",new OracleConnector());
      }
      connector = connectorMap.get(key);
    }
    return connector;
  }
}
