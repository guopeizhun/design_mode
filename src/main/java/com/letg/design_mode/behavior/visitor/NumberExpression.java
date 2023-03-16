package com.letg.design_mode.behavior.visitor;

import java.security.cert.Extension;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/15 15:35
 * @Description:
 */


/**
 * 数字表达式
 */
public class NumberExpression implements Expression {
    private int num;

    public NumberExpression(int num) {
        this.num = num;
    }

    @Override
    public int accpet(Visitor visitor) {
        return visitor.visit((Expression) this);
    }

    public int getNum() {
        return num;
    }
}
