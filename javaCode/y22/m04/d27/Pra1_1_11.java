package y22.m04.d27;

public class Pra1_1_11 {
    public static void main(String[] args) {
        boolean[][] a = new boolean[10][10];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i == j){
                    a[i][j] = true;
                }
            }
        }
        for (boolean[] booleans : a) {
             for (boolean aBoolean : booleans) {
                if (aBoolean) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
