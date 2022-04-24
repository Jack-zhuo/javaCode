public class Pra1_1_24gcd {
    public static void main(String[] args) {
        System.out.println(gcd(105,24));
    }

    private static int gcd(int a,int b) {
        System.out.println("a:"+a+"   b:"+b);
        if (b == 0) return a;
        int temp = a%b;
        return gcd(b,temp);
    }


}
