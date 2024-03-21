import java.util.Scanner;

public class Average {
    public static void doAverage(){
        int numbersQuantity = 0;
        int numberSum = 0;
        int average = 0;
        boolean programFinished = false;

        while (!programFinished){
            System.out.println("Write a number");
            Scanner sc = new Scanner(System.in);
            int actualNumber = sc.nextInt();

            if (actualNumber > 0 ) {
                numberSum = numberSum + actualNumber;
                numbersQuantity++;
            } else {
                programFinished = true;
            }
        }

       if (numberSum > 0){
           System.out.println("Numbers Average is:");
           System.out.println(numberSum / numbersQuantity);
       } else {
           System.out.println("too many numbers to calculate an average number");
       }
    }
}
