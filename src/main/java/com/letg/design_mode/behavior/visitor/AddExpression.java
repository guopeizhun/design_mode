package com.letg.design_mode.behavior.visitor;

import java.security.cert.Extension;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/15 15:40
 * @Description:
 */


/**
 * 加法表达式
 */
public class AddExpression implements Expression{

    private NumberExpression left;
    private NumberExpression right;

    public AddExpression(NumberExpression left,NumberExpression right) {
        this.left = left;
        this.right = right;
    }
    @Override
    public int accpet(Visitor visitor) {
        return visitor.visit((Expression) this);
    }

    public NumberExpression getLeft() {
        return left;
    }

    public NumberExpression getRight() {
        return right;
    }

}
