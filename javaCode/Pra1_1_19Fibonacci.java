public class Pra1_1_19Fibonacci {
    public static void main(String[] args) {
        System.out.println(ln(5));
    }

    private static long ln(int a) {
        if (a == 1) return 1;
        return a * ln(a - 1);
    }

    private static long F1(int N) {
        if (N == 0) return 0;
        if (N == 1) return 1;
        return F1(N - 1) + F1(N - 2);
    }

    private static long F2(int N) {
        long n1 = 1;
        long n2 = 1;
        long temp;
        for (int i = 2; i < N; i++) {
            temp = n1;
            n1 = n2;
            n2 = n2 + temp;
        }
        return n2;
    }

}
