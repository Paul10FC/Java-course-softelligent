package BodyMassCalculator;

import java.util.Scanner;

public class Calculator {

    public static void massCalculator() throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello! Welcome to the body mass calculator");
        System.out.println("Put your age");

        int age = sc.nextInt();
        isValidAge(age);

        System.out.println("Please, select your gender\n(1) Man\t(2) Woman");
        String gender = getGender();

        System.out.println("Now write your height with decimal dot");
        double height = sc.nextDouble();

        System.out.println("Now write your weight");
        int weight = sc.nextInt();

        Person person = new Person(gender, age, height, weight);
        person.getBMI();
    }

    private static String getGender() {
        Scanner sc = new Scanner(System.in);

        boolean isValidOption = false;
        String gender = "";

        while (!isValidOption) {
            int optionSelected = sc.nextInt();
            switch (optionSelected) {
                case 1 -> {
                    gender = "Man";
                    isValidOption = true;
                }
                case 2 -> {
                    gender = "Woman";
                    isValidOption = true;
                }
                default -> System.out.println("Invalid option, try again");
            }
        }
        return gender;
    }

    public static void isValidAge(int age) throws Exception {
        if (age < 20) throw new Exception("You are less than 20 years old");
    }

    public static void rateBMI(int bmi){
       if (bmi < 18.4){
           System.out.println("You have a less weight");
       } else if (bmi < 24.9) {
           System.out.println("You weight is normal");
       } else {
           System.out.println("You have obesity");
       }
    }
}