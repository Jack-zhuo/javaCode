package y22.m05.d21.calculate;

public class Circle implements Area {
    public double getBanjing() {
        return banjing;
    }

    public void setBanjing(double banjing) {
        this.banjing = banjing;
    }

    private double banjing;

    public Circle(double banjing) {
        this.banjing = banjing;
    }



    @Override
    public double calculateArea() {
        return banjing*banjing*Math.PI;
    }
}
