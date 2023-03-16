package com.letg.design_mode.behavior.visitor;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/15 15:50
 * @Description:
 */


public class Client {
    public static void main(String[] args) {
        AddExpression expression = new AddExpression(new NumberExpression(4), new NumberExpression(11));
        Visitor visitor = new VisitorImpl();
        System.out.println(visitor.visit(expression));

    }
}
