package ExceptionsProgram;

import java.util.Scanner;
import static ExceptionsProgram.ExceptionsProgram.*;



public class MenuProgramException {
    public static void startProgram(){
        boolean isProgramFinished = false;

        while (!isProgramFinished) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Welcome to our runTimeExceptions program");
            System.out.println("Choose the exception you want to test");
            System.out.println(
                    """
                                    (1) Arithmetic Exception
                                    (2) ArrayIndexOutOfBounds
                                    (3) ClassCastException
                                    (4) IllegalArgumentException
                                    (5) NullPointerException
                                    (6) NumberFormatException
                                    (0) Exit Program
                            """
            );

            int menuScanner = sc.nextInt();
            switch (menuScanner){
                case 1 -> arithmeticException();
                case 2 -> arrayIndexOutOfBounds();
                case 3 -> classCastException();
                case 4 -> illegalArgumentException();
                case 5 -> nullPointerException();
                case 6 -> numberFormatException();
                case 0 -> isProgramFinished = true;
                default -> System.out.println("Invalid selection, try again");
            }
        }
    }
}
