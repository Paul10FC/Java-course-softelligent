package JavaBasics;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class OddNumbers {
    public static void firstTenOddNumbersProgram(){
        int imparMultiplication = 1;
        List<Integer> userNumbers = getOddNumber();


        int imparCount = 0;
        for (Integer actualNumber: userNumbers) {
            if ((actualNumber % 2) != 0){
                imparMultiplication *= actualNumber;
                imparCount++;
            }
        }

        if (imparMultiplication == 1) {
            System.out.println("There is any odd number");
        } else {
            System.out.println("The first 10 numbers multiplication is: " + imparMultiplication);
        }
    }

    public static List<Integer> getOddNumber(){
        List<Integer> userNumbers = new ArrayList<>();

        for (int i = 0; i < 10;) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Input your '" + i + "' number");
            try {
                int actualNumber = sc.nextInt();
                userNumbers.add(actualNumber);
                i++;

            } catch (IllegalArgumentException | InputMismatchException e){
                System.out.println("Invalid input");
            }
        }
        return userNumbers;
    }
}
