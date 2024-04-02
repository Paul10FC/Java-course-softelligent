package Animal;

import lombok.ToString;

@ToString
public abstract class Animal {
    protected String name;
    protected String foodType;
    protected int age;
    protected String animalKind;

    public Animal(String name, String foodType, int age, String animalKind) {
        this.name = name;
        this.foodType = foodType;
        this.age = age;
        this.animalKind = animalKind;
    }

    public abstract void makeSound();
}
