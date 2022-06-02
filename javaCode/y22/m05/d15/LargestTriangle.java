package y22.m05.d15;

public class LargestTriangle {
    public static void main(String[] args) {
        int[][] points = new int[][]{{0,0},{0,1},{1,0},{0,2},{2,0}};
        points = new int[][]{{-11, -15}, {4, 4}, {25, -19}, {32, 17}, {-24, 41}, {-4, 33}, {29, 33}, {-24, 28}, {13, -21}, {-1, -28}};
        double v = largestTriangleArea(points);
        System.out.println(v);
    }
    public static double largestTriangleArea(int[][] points) {
        double S = 0;
        for (int i = 0; i < points.length-2; i++) {
            for (int j = i+1; j < points.length-1; j++) {
                double x1 = points[i][0];
                double y1 = points[i][1];

                double x2 = points[j][0];
                double y2 = points[j][1];

                for (int k = j+1; k < points.length; k++) {
                    double x3 = points[k][0];
                    double y3 = points[k][1];

                    double l1 = Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1-y2),2));
                    double l2 = Math.sqrt(Math.pow((x1-x3),2) + Math.pow((y1-y3),2));
                    double l3 = Math.sqrt(Math.pow((x3-x2),2) + Math.pow((y3-y2),2));

                    double p = (l1+l2+l3)/2;
                    double a1 = Math.abs(p - l1);
                    double a2 = Math.abs(p - l2);
                    double a3 = Math.abs(p - l3);
                    double x = p * a1 * a2 * a3;
                    double middle = Math.sqrt(x);
                    S = Math.max(middle,S);

                }
            }
        }

        return S;
    }
}
