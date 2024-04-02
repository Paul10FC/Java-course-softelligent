package Animal;

public class Dog extends Animal {
    private String animalKind;

    public Dog(String name, String foodType, int age, String animalKind) {
        super(name, foodType, age, animalKind);
    }

    @Override
    public void makeSound() {
        System.out.println(this.name + " makes the sound");
        System.out.println("Guaf!");
    }
}
