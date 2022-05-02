package y22.m05.d02;

import java.util.Scanner;

public class Demo02_String {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String exp = "\\d{17}[X|\\d]";
        if (s.matches(exp)){
            System.out.println("successfully.");
        }else {
            System.out.println("failed");
        }
    }
}
