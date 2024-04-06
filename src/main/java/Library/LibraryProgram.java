package Library;

import Library.Actions.RegisterItem;

import java.util.Scanner;

import static Library.Actions.LibraryActions.doLibraryAction;
import static Library.Actions.RegisterItem.registerItemProgram;

public class LibraryProgram {
    public static void principalMenu() {
        System.out.println("Welcome to our library");

        Scanner sc = new Scanner(System.in);
        boolean isProgramFinished = false;

        while (!isProgramFinished) {

            System.out.println("What would you like to do?");
            System.out.println("(1) Register Item\t(2) Do a library action\t(0) finish program");
            int optionSelected = sc.nextInt();

            switch (optionSelected) {
                case 1 -> registerItemProgram();
                case 2 -> doLibraryAction();
                case 0 -> isProgramFinished = true;
                default -> System.out.println("Invalid selection");
            }
        }
    }
}
