package Animal;

public class Horse extends Animal {
    private String animalKind;

    public Horse(String name, String foodType, int age, String animalKind) {
        super(name, foodType, age);
        this.animalKind = animalKind;
    }

    @Override
    public void makeSound() {
        System.out.println(this.name + " makes the sound");
        System.out.println("huh!");
    }
}
