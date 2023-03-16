package com.letg.design_mode.behavior.interpret;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/15 17:44
 * @Description:
 */


public class Client {
    public static void main(String[] args) {
        TerminalExpression expressionA = new TerminalExpression("candy");
        TerminalExpression expressionB = new TerminalExpression("tom");
        OrExpression hasPerson = new OrExpression(expressionA, expressionB);
        System.out.println(hasPerson.interpret("tony"));

    }
}
