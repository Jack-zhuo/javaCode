package y22.m05.d27;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class calculator {
    public int add(int a,int b){
        return a+b;
    }

    public static void main(String[] args) throws Exception {
        calculatorTest cal = new calculatorTest();

        Class cls = Class.forName("y22.m05.d27.calculatorTest");
        Class cls2 = calculatorTest.class;
        Class cls3 = cal.getClass();

        Method at = cls.getMethod("addTest");

        at.invoke(cal);
    }
}
