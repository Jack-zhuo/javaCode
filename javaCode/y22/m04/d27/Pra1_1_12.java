package y22.m04.d27;

public class Pra1_1_12 {
    public static void main(String[] args) {
       int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = 9-i;
        }
        for (int i = 0; i < 10; i++) {
            a[i] = a[a[i]];
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(a[i]);
        }
    }
}
