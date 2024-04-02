package Animal;

public class Cat extends Animal{

    public Cat(String name, String foodType, int age, String animalKind) {
        super(name, foodType, age, animalKind);
    }

    @Override
    public void makeSound() {
        System.out.println(this.name + " makes the sound");
        System.out.println("Meaw!");
        String animalName = "cat";
        System.out.println(
                "\nType: " + this.animalKind +
                        "\nAnimal Name: " + animalName +
                        "\nFood Type: " + this.foodType +
                        "\nAge: " + this.age
        );
    }
}
