package com.letg.design_mode.behavior.interpret;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/15 17:39
 * @Description:
 */


public class TerminalExpression implements Expression {
    String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
      return context.contains(data);
    }
}
