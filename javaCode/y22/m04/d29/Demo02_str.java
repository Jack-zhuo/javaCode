package y22.m04.d29;

public class Demo02_str {
    public static void main(String[] args) {
        String m = mystery("zhuo yue ai ying ying ...");
        System.out.println(m);
    }

    private static String mystery(String s) {
        int n = s.length();
        if (n <= 1) return s;
        String a = s.substring(0,n/2);
        String b = s.substring(n/2,n);
        return mystery(a) + mystery(b);
    }
}
