package BodyMassCalculator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Person {
    private String gender;
    private int age;
    private double height;
    private double weight;

    public void getBMI(){
        System.out.println("You are a " + this.gender + " " + this.age + " years old");
        System.out.println("Your BMI is: " + Math.floor( this.weight / (Math.pow(this.height, 2))) );
    }
}
