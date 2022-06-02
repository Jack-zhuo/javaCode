package y22.m05.d11.Animals;

public class Animal {
    private String animalName;
    private byte animalAge;

    public Animal(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public byte getAnimalAge() {
        return animalAge;
    }

    public void setAnimalAge(byte animalAge) {
        this.animalAge = animalAge;
    }

    public void shout(){
        System.out.println(animalName+"发出了叫声");
    }
}
