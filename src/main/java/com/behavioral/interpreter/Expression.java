package com.behavioral.interpreter;

import java.util.HashMap;

public abstract class Expression {

    //解釋公式和數值，KEY 就是公式表達式參數[a,b,c], value 就是具體的值
    //HashMap{a=10, b=20}
    public abstract int interpreter(HashMap<String, Integer> var);
}
