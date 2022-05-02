package y22.m04.d25;

public class Outer {
    private int age;
    static String SCHOOL;

    public class Inner {
        String name;

        public Inner(String s, int a) {
            age = a;
            name = s;
        }

        public void print() {
            System.out.println("name:" + name + ", age:" + age);
        }
    }

    static class Inside {
        String name;

        public Inside(String s, String n) {
            SCHOOL = s;
            name = n;
        }

        public void print() {
            System.out.println("school:" + SCHOOL + ", name:" + name);
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();   //create outer class.
        //create object of internal class related with object of external class.
        Inner inner = outer.new Inner("卓越", 22);
        //directly create object of static internal class.
        Inside inside = new Inside("三联大学", "张三");
        inner.print();
        inside.print();


    }
}
