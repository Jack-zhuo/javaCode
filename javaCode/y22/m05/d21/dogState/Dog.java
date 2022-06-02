package y22.m05.d21.dogState;

public class Dog {
    DogState state;
    public void show(){
        state.showState();
    }
    public void setState(DogState s){
        this.state = s;
    }
}
