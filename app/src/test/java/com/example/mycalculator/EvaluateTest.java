package com.example.mycalculator;

import org.junit.Test;
import static org.junit.Assert.*;

public class EvaluateTest {
    // add test
    @Test
    public void testadd() throws Exception {
        MathEval eval = new MathEval();
        String res;
        String exp;
        // passing test
        res = eval.evaluate("1+1");
        exp = "2";
        assertEquals(exp, res);

        res = eval.evaluate("1.01+1");
        exp = "2.01";
        assertEquals(exp, res);

        // failing test
        res = eval.evaluate("1+1");
        exp = "2.0";
        assertEquals(exp, res);
    }

    @Test
    public void testsubtract() throws Exception {
        MathEval eval = new MathEval();
        String res;
        String exp;
        //passing test
        res = eval.evaluate("1-1");
        exp = "0";
        assertEquals(exp, res);

        res = eval.evaluate("100.1-10.1");
        exp = "90";
        assertEquals(exp, res);

        res = eval.evaluate("1-3");
        exp = "-2";
        assertEquals(exp, res);

        //failing test
        res = eval.evaluate("5-3");
        exp = "-2";
        assertEquals(exp, res);
    }
}
