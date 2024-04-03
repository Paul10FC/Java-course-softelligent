package Enterprise;

import java.util.Optional;
import java.util.Scanner;

public class RegisterProgram {
    public static POSITIONS selectPosition(){
        System.out.println("Position\n(1) Sr Developer\t(2) Jr Developer\t(3) Manager");

        Scanner creationOfEmployeeSc = new Scanner(System.in);
        int positionSelected = creationOfEmployeeSc.nextInt();

        boolean isInvalidPosition = true;
        Optional<POSITIONS> position = Optional.empty();

        while (isInvalidPosition)
            switch (positionSelected) {
                case 1:
                    position = Optional.of(POSITIONS.SR_DEVELOPER);
                    isInvalidPosition = false;
                    break;
                case 2:
                    position = Optional.of(POSITIONS.JR_DEVELOPER);
                    isInvalidPosition = false;
                    break;
                case 3:
                    position = Optional.of(POSITIONS.MANAGER);
                    isInvalidPosition = false;
                    break;
                default:
                    System.out.println("Invalid position");
            }
        return position.get();
    }

    public static void registerEmployee(String name, String address, int salary, POSITIONS position) {
        switch (position){
            case SR_DEVELOPER -> {
                Employee.employees.add(new SrDeveloper(name, address, salary, position));
                System.out.println("The Sr developer " + name + " was created");
            }

            case JR_DEVELOPER -> {
                Employee.employees.add(new JrDeveloper(name, address, salary, position));
                System.out.println("The Jr developer " + name + " was created");
            }

            case MANAGER -> {
                Employee.employees.add(new Manager(name, address, salary, position));
                System.out.println("The Manager " + name + " was created");
            }
        }
    }
}
