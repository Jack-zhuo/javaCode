import java.util.Arrays;

public class Pra1_1_14 {
    public static void main(String[] args) {
        System.out.println(lg(1024));
        System.out.println(Arrays.toString(histogram2(new int[]{0, 1, 1, 2, 2, 2, 3, 3}, 4)));
    }

    public static int lg(int N) {
        int m = 1;
        int a = -1;
        while (m <= N) {
            a++;
            m = m * 2;
        }
        return a;
    }

    public static int[] histogram(int[] a, int M) {
        int[] b = new int[M];
        for (int i = 0; i < b.length; i++)
            for (int k : a) if (k == i) b[i]++;
        return b;
    }

    public static int[] histogram2(int[] a, int M) {
        int[] b = new int[M];
        for (int j : a) {
            if (j >= 0 && j < M) b[j]++;
        }
        return b;
    }
}
