package com.example.mycalculator;


import java.math.BigDecimal;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class MathEval {

    public ScriptEngine engine;
    public MathEval() {
        engine = new ScriptEngineManager().getEngineByName("rhino");
    }

    public String evaluate(String expression) throws Exception {
        String result = engine.eval(expression).toString();
        BigDecimal decimal = new BigDecimal(result);
        String val = decimal.setScale(2, BigDecimal.ROUND_HALF_UP).toPlainString();
        if(val.charAt(val.length() - 1) == '0' && val.charAt(val.length() -2) == '0'){
            return val.substring(0, val.length() - 3);
        } else{
            return val;
        }
    }
}
