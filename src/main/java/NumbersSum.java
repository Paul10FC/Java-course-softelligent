import java.util.Scanner;

public class NumbersSum {
    int sum = 0;
    public static void program(){
        int number = 0;
        int sum = 0;
        do {
            System.out.println("Write a number");
            Scanner sc = new Scanner(System.in);
            number = sc.nextInt();
            sum = sum + number;
        } while (number != 0);

        System.out.println("The total numbers sum is: " + sum);
    }
}
