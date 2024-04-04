package Person;

public class PersonStartProgram {
    public static void startProgram(){
        Employee employee = new Employee(
                "Hernandez",
                "Hernandez",
                "Nicolas",
                "10",
                "19",
                "2000",
                "RK7"
        );

        System.out.println(employee);
        employee.getRfc();
    }
}
