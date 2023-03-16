package com.letg.design_mode.behavior.visitor;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/15 15:43
 * @Description:
 */


public class VisitorImpl implements Visitor {
    @Override
    public int visit(Expression expression) {
        if (expression instanceof NumberExpression) {
            return ((NumberExpression) expression).getNum();
        } else if (expression instanceof AddExpression) {
            return ((AddExpression) expression).getLeft().accpet(this) + ((AddExpression) expression).getRight().accpet(this);
        }
        return 0;
    }
}
