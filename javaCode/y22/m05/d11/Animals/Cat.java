package y22.m05.d11.Animals;

public class Cat extends Animal {
    public Cat(String animalName) {
        super(animalName);
    }
    public void eat(){
        System.out.println(getAnimalName() + " is eating!!!!");
    }
}
