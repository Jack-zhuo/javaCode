package y22.m05.d12;

import java.util.Iterator;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        Stack<String> sfcs = new Stack<>();
        sfcs.push("I");
        sfcs.push("love");
        sfcs.push("java");
        sfcs.push(".");
        sfcs.push("you");

        Iterator<String> i = sfcs.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

//        String p1 = sfcs.pop();
//        int length = sfcs.size();
//        for (int i = 0; i < length; i++) {
//            System.out.println("===="+sfcs.size());
//            System.out.println(sfcs.pop());
//        }
//        for (String s :
//                sfcs) {
//            System.out.println(s);
//        }

    }
}
