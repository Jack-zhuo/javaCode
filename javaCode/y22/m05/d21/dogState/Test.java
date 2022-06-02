package y22.m05.d21.dogState;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setState(new MeetEnemyState());
        dog.show();
    }
}
