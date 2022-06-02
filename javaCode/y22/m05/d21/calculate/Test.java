package y22.m05.d21.calculate;

public class Test {
    public static void main(String[] args) {
        Circle c = new Circle(3);
        Rectangle r = new Rectangle(3, 3);
        double v = c.calculateArea();
        System.out.println(v);
        double v1 = r.calculateArea();
        System.out.println(v1);
    }
}
