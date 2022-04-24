import java.util.Arrays;

public class Pra1_1_18mystery {
    public static void main(String[] args) {
        System.out.println(mystery(70, 25));
    }

    private static int mystery(int a, int b) {
        if (b == 0) return 0;
        if (b % 2 == 0) return mystery(2*a,b/2);
        return mystery(2*a,b/2) + a;
    }

}
