package Animal;

public abstract class Animal {
    protected String name;
    protected String foodType;
    protected int age;

    public Animal(String name, String foodType, int age) {
        this.name = name;
        this.foodType = foodType;
        this.age = age;
    }

    public abstract void makeSound();
}
