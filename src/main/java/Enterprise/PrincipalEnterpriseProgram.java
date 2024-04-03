package Enterprise;

import java.util.Objects;
import java.util.Scanner;

public class PrincipalEnterpriseProgram {
    public static void startCompanyProgram(){
        boolean isProgramNotFinished = true;

        while (isProgramNotFinished) {
            System.out.println("Welcome to our company program");
            System.out.println("What would you like to do?");
            System.out.println("(1) Register Employee\t(2) Do Employee action\t(0) Finish program");

            Scanner sc = new Scanner(System.in);
            int selection = sc.nextInt();

            if (selection == 1) {
                registerEmployee();
            } else if (selection == 2){
                doEmployeeAction();
            } else {
                System.out.println("Program finished, goodbye!");
                isProgramNotFinished = false;
            }
        }
    }

    private static void doEmployeeAction() {
        System.out.println("(1) Calculate Bonus\t(2) Generate Report\t(3) Do work action");

        Scanner sc = new Scanner(System.in);
        int optionSelected = sc.nextInt();

        switch (optionSelected){
            case 1 -> WorkActions.calculateBonus();
            case 2 -> WorkActions.generateReport();
            case 3 -> WorkActions.doWorkAction();
            default -> System.out.println("Invalid option, try again");
        }
    }

    private static void registerEmployee() {
        Scanner creationOfEmployeeSc = new Scanner(System.in);
        System.out.println("Select the next information of employee");

        System.out.println("Name");
        String name = creationOfEmployeeSc.nextLine();

        System.out.println("Address");
        String address = creationOfEmployeeSc.nextLine();

        System.out.println("Salary");
        int salary = creationOfEmployeeSc.nextInt();

        POSITIONS position = RegisterProgram.selectPosition();

        RegisterProgram.registerEmployee(name, address, salary, position);
    }
}
