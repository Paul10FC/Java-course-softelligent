package Animal;

import java.util.Optional;
import java.util.Scanner;

public class AnimalProgram {
    public static void startProgram(){

        int animalNumber = animalSelection();
        Animal actualAnimal = animalCreation(animalNumber);
        actualAnimal.makeSound();

    }

    private static int animalSelection() {
        int animal = 0;
        boolean isInvalidOption = true;
        System.out.println("Welcome to our animal program");
        System.out.println("Select an animal");

        while (isInvalidOption){
            System.out.println("(1) Dog \t(2) Cat \t(3) Horse");
            Scanner sc = new Scanner(System.in);
            animal = sc.nextInt();

            if (animal > 0 && animal < 4){
                isInvalidOption = false;
            } else {
                System.out.println("Your option is invalid");
            }
        }
        return animal;
    }

    private static Animal animalCreation(int animalNumber){
        Scanner sc = new Scanner(System.in);
        Scanner foodSc = new Scanner(System.in);

        System.out.println("Write your animal name");
        String name = sc.nextLine();

        System.out.println("Write your animal age");
        int age = sc.nextInt();

        System.out.println("Write your animal Food Type");
        String foodType = foodSc.nextLine();

        if (animalNumber == 1){
            return new Dog(name, foodType, age, "Canine");

        } else if (animalNumber == 2) {
            return new Cat(name, foodType, age, "Feline");

        } else {
            return new Horse(name, foodType, age, "Perissodactyla");
        }
    }
}
