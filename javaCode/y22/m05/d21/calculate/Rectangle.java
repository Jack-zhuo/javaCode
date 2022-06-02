package y22.m05.d21.calculate;

public class Rectangle implements Area {
    private double c;
    private double k;

    public Rectangle(double c,double k) {
        this.c = c;
        this.k = k;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public double calculateArea() {
        return c*k;
    }
}
