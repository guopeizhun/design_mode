package com.letg.design_mode.structural.bridge;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/13 16:32
 * @Description:
 */


public abstract class Shape {
    protected Color color;

    public Shape(Color color){
        this.color = color;
    }

    public abstract void drawShape();
}
