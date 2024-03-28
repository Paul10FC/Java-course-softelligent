package BodyMassCalculator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Person {
    private String gender;
    private int age;
    private double height;
    private double weight;

    public double getBMI(){
        double BMI = Math.floor( this.weight / (Math.pow(this.height, 2)));
        System.out.println("You are a " + this.gender + " " + this.age + " years old");
        System.out.println("Your BMI is: " + BMI);
        return BMI;
    }
}
