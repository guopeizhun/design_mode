package com.letg.design_mode.structural.combined;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/14 10:36
 * @Description:复合节点
 */


public class Composite implements Component{
    private List<Component> componentList = new ArrayList<>();
    @Override
    public void operate() {
        for (Component component : componentList) {
            component.operate();
        }
    }
    public void add(Component component){
        componentList.add(component);
    }
}
