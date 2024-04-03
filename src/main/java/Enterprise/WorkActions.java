package Enterprise;

import java.util.*;

public class WorkActions {
    public static void calculateBonus(){
        Optional<Employee> employee = selectEmployee();
        employee.ifPresent(value -> System.out.println(value.calculateBonus()));
    }

    public static void generateReport() {
        Optional<Employee> employee = selectEmployee();
        employee.ifPresent(value -> System.out.println(value.generateReport()));
    }

    public static void doWorkAction() {
        Optional<Employee> employee = selectEmployee();
        employee.ifPresent(Employee::doAWorkAction);
    }

    public static Optional<Employee> selectEmployee(){
        System.out.println("What employee do you want to see");
        System.out.println("(1) Sr Developer\t(2) Jr Developer\t(3) Manager");

        Scanner sc = new Scanner(System.in);
        int typeOfEmployeeSelected = sc.nextInt();
        POSITIONS employeePosition =
                (typeOfEmployeeSelected == 1) ? POSITIONS.SR_DEVELOPER :
                        (typeOfEmployeeSelected == 2) ? POSITIONS.JR_DEVELOPER : POSITIONS.MANAGER;

        System.out.println("Select one employee to see his information or 0 to return");
        List<Employee> employeeList = new ArrayList<>();
        int employeeNumber = 1;

        for (Employee actualEmployee : Employee.employees) {
            if (Objects.equals(actualEmployee.position, employeePosition)){
                employeeList.add(actualEmployee);
                System.out.println(employeeNumber + ".- " + actualEmployee.name);
                employeeNumber++;
            }
        }
        int employeeNumberSelected = sc.nextInt();

        return employeeNumberSelected == 0 ? Optional.empty() : Optional.of(employeeList.get(employeeNumberSelected - 1));
    }
}
