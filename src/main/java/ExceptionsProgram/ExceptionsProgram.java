package ExceptionsProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExceptionsProgram {
    public static void arithmeticException(){
        int number1 = 10;
        int number2 = 0;

        System.out.println(number1 + " / " + number2);
        try {
            System.out.println(number1 / number2);
        } catch (ArithmeticException e){
            System.out.println("This exception is causes for: ");
            System.out.println(e.getMessage());
        }
    }

    public static void arrayIndexOutOfBounds() {

        final int[] arrayList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("the arrayList we have is " + arrayList.length + " length");
        System.out.println("We are going to do a 15 numbers iteration");

        try {
            for (int i = 0; i < 15; i++) {
                System.out.println("number " + i);
                System.out.println(arrayList[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("We are out of bounds!");
            System.out.println(e.getMessage());
        }
    }

    public static void classCastException(){
        System.out.println("We are going to cast int to String");

        try {
            Object x = new Integer(0);
            System.out.println((String) x);
        } catch (ClassCastException e){
            System.out.println("We cannot cast this types");
            System.out.println(e.getMessage());
        }
    }

    public static void illegalArgumentException() throws IllegalArgumentException{
        System.out.println("We are going to input a number, please write a negative number to throws the exception");
        Scanner sc = new Scanner(System.in);
        int negativeNumber = sc.nextInt();

        if (negativeNumber < 0){
            throw new IllegalArgumentException();
        } else {
            System.out.println("There isn´t any error! ");
        }
    }

    public static void numberFormatException(){
        System.out.println("This is going to happen if we try to cast a String to Int without the correct format");
        String stringToCast = "Hello world!";

        try {
            System.out.println("String: " + stringToCast);
            int number = Integer.parseInt(stringToCast);
        } catch (NumberFormatException e){
            System.out.println("We cannot cast this type of String to Integer");
            System.out.println(e.getMessage());
        }
    }

    public static void nullPointerException(){
        System.out.println("This throws when something is null");
        Object noIntNumber = null;

        try {
            System.out.println("Object: " + noIntNumber);
            noIntNumber.toString();
        } catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
    }
}
