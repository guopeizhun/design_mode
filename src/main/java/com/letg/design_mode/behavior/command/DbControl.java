package com.letg.design_mode.behavior.command;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/14 15:46
 * @Description:
 */


public class DbControl {
    Map<Integer, Command> commandMap;

    public DbControl() {
        commandMap = new HashMap<>();
    }

    public void put(int key, Command command) {
        if (!commandMap.containsKey(key)) commandMap.put(key, command);
    }

    public void sendCommand(int key){
        commandMap.get(key).exec();
    }
}
