package y22.m05.d08;

import java.util.Stack;

public class Evaluate {
    public static void main(String[] args) {
        double v = expressionCaculate("(2 * ( 3 + 2 ))");
        System.out.println(v);
    }
    static double expressionCaculate(String str){
        Stack<String> opr = new Stack<String>();
        Stack<Double> number = new Stack<Double>();

        String[] list = str.split(" ");
        for (String s : list) {
            if (s.equals("(")){
                continue;
            }else if (s.equals("+")){
                opr.push(s);
            }else if (s.equals("-")){
                opr.push(s);
            }else if (s.equals("*")){
                opr.push(s);
            }else if (s.equals("/")){
                opr.push(s);
            }else if (s.equals(")")){
                String op = opr.pop();
                double val = number.pop();
                switch (op){
                    case "+":
                        val = number.pop() + val;
                        break;
                    case "-":
                        val = number.pop() - val;
                        break;
                    case "*":
                        val = number.pop() * val;
                        break;
                    case "/":
                        val = number.pop() / val;
                        break;
                }
                number.push(val);
            }else {
                number.push(Double.parseDouble(s));
            }

        }
        return number.pop();
    }
}
