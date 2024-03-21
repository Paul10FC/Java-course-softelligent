import java.util.Arrays;
import java.util.Scanner;

public class MajorMinor {
    public static int[] inputNumbers(){
        Scanner sc = new Scanner(System.in);
        int[] userNumbers = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1)  + " number");
            int actualNumber = sc.nextInt();
            userNumbers[i] = actualNumber;
        }
        return userNumbers;
    }

    public static void majorMinorCalculator(){
        int majorNumber = 0;
        int minorNumber = 0;
        int[] userNumbers = inputNumbers();

        for (int i = 0; i < userNumbers.length; i++) {
            int actualNumber = userNumbers[i];
            System.out.println("The " + (i + 1) + " number is: " + actualNumber);
            majorNumber = Math.max(actualNumber, majorNumber);
            minorNumber = Math.min(actualNumber, minorNumber);
        }
        System.out.println("The major number is: " + majorNumber);
        System.out.println("The minor number is: " + minorNumber);
    }
}
