package com.letg.design_mode.behavior.interpret;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/15 17:41
 * @Description:
 */


public class OrExpression implements Expression{
    private final Expression expressionA;
    private final Expression expressionB;

    public OrExpression(Expression expressionA,Expression expressionB){
        this.expressionA = expressionA;
        this.expressionB = expressionB;
    }
    @Override
    public boolean interpret(String context) {
        return expressionA.interpret(context) || expressionB.interpret(context);
    }
}
