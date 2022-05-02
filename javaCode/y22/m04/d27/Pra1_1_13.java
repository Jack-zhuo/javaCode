package y22.m04.d27;

public class Pra1_1_13 {
    public static void main(String[] args) {
        int m = 3;
        int n = 4;
        int[][] ass1 = new int[m][n];
        for (int i = 0; i < ass1.length; i++) {
            for (int j = 0; j < ass1[i].length; j++) {
                ass1[i][j] = (int)(Math.random()*10);
                System.out.print(ass1[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println("转置后：");
        int[][] ass2 = new int[n][m];
        for (int i = 0; i < ass2.length; i++) {
            for (int j = 0; j < ass2[i].length; j++) {
                ass2[i][j] = ass1[j][i];
                System.out.print(ass2[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
