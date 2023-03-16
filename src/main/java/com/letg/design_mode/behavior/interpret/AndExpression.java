package com.letg.design_mode.behavior.interpret;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/15 17:44
 * @Description:
 */


public class AndExpression implements Expression{
  private final Expression expressionA;
  private final Expression expressionB;

  public AndExpression(Expression expressionA,Expression expressionB){
    this.expressionA = expressionA;
    this.expressionB = expressionB;
  }
  @Override
  public boolean interpret(String context) {
    return expressionA.interpret(context) && expressionB.interpret(context);
  }
}
