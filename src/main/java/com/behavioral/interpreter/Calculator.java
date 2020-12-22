package com.behavioral.interpreter;

import java.util.HashMap;
import java.util.Stack;

public class Calculator {

    private Expression expression;

    public Calculator(String expStr) {
        //安排運算先後順序
        Stack<Expression> stack = new Stack<>();
        //拆字數組
        char[] charArray = expStr.toCharArray();

        Expression left = null;
        Expression right = null;
        //[a,+,b]
        for (int i=0; i < charArray.length; i++) {
            switch (charArray[i]) {
                case '+':
                    left = stack.pop();//從stack取出left;
                    right = new VarExpression(String.valueOf(charArray[++i]));//取出右表達式 b
                    stack.push(new AddExpression(left, right));
                    break;
                case '-':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new SubExpression(left, right));
                    break;
                default:
                    //如果是var，那就創建給VarExpression對象，並push到stack
                    stack.push(new VarExpression(String.valueOf(charArray[i])));
                    break;
            }
        }
        this.expression = stack.pop();
    }

    public int run(HashMap<String, Integer> var) {
        //將表達式a+b和var = {a=10, b=20}
        //最後傳遞給expression的interpreter進行解釋執行。
        return this.expression.interpreter(var);

    }
}
