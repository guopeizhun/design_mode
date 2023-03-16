package com.letg.design_mode.structural.bridge;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/13 16:37
 * @Description:
 */


public class ShapeX extends Shape{
    public ShapeX(Color color) {
        super(color);
    }

    @Override
    public void drawShape() {
        color.drawColor();
        System.out.println("draw:X");
    }
}
