package com.behavioral.interpreter;

import java.util.HashMap;

public class SymbolExpression extends  Expression {

    protected Expression left;
    protected Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    //這裡會由子類來實現，所以設為默認
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return 0;
    }
}
