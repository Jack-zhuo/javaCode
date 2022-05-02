package y22.m04.d27;

class Teacher {
    private double sumClass;
    private double coefficient;
    static int amount = 0;

    Teacher(double sumClass, double coefficient) {
        amount++;
        this.sumClass = sumClass;
        this.coefficient = coefficient;
    }

    double courseCompute() {
        return sumClass * coefficient;
    }
    int getTeacherAmount(){
        return amount;
    }
}

public class TeacherTest {
    public static void main(String[] args) {
        Teacher t1 = new Teacher(96, 1.2);
        Teacher t2 = new Teacher(64, 1.2);
        System.out.println("总共有"+Teacher.amount+"位老师。");
        double v1 = t1.courseCompute();
        double v2 = t2.courseCompute();
        System.out.println("第一位老师当量课时："+v1+",第二位老师当量课时："+v2);
    }
}
