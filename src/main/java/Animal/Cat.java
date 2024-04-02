package Animal;

public class Cat extends Animal{
    private String animalKind;

    public Cat(String name, String foodType, int age, String animalKind) {
        super(name, foodType, age, animalKind);
    }

    @Override
    public void makeSound() {
        System.out.println(this.name + " makes the sound");
        System.out.println("Meaw!");
    }
}
