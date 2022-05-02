package y22.m04.d29;

public class Demo01_str {
    public static void main(String[] args) {
        String str1 = "hello,world!";
        String str2 = ",world!hello";
        if (str2.length() == str1.length() && str1.concat(str1).contains(str2)) {
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
