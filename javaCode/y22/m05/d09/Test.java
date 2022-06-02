package y22.m05.d09;

public class Test {
    public static void main(String[] args) {
        FixedCapacityStack<String> s = new FixedCapacityStack<String>(100);
        s.push("卓越");
        s.push("侯莹莹");
        s.push("马涛");
        for (int i = 0; i < 3; i++) {
            System.out.println(s.pop());
        }
    }
}
