package Animal;

public class Dog extends Animal {

    public Dog(String name, String foodType, int age, String animalKind) {
        super(name, foodType, age, animalKind);
    }

    @Override
    public void makeSound() {
        System.out.println(this.name + " makes the sound");
        System.out.println("Guaf!");
        String animalName = "dog";
        System.out.println(
                "\nType: " + this.animalKind +
                        "\nAnimal Name: " + animalName +
                        "\nFood Type: " + this.foodType +
                        "\nAge: " + this.age
        );
    }
}
