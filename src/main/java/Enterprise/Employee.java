package Enterprise;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public abstract class Employee {
    public static List<Employee> employees = new ArrayList<>();

    protected String name;
    protected String address;
    protected int salary;
    protected POSITIONS position;

    public abstract double calculateBonus();
    public StringBuilder generateReport(){

        int extension = this.name.length() + 19;
        int middlePosition = extension / 2;

        StringBuilder report = new StringBuilder();

        int nameLength = this.name.length();
        int excellentLength = "Excellent".length();

        int nameSpaces = Math.max(0, middlePosition - nameLength);
        int excellentSpaces = Math.max(0, extension - (nameSpaces + nameLength + excellentLength));

        report.append("-".repeat(extension)).append("\n|");
        report.append(this.name).append(" ".repeat(nameSpaces)).append("|");
        report.append("Excellent").append(" ".repeat(excellentSpaces)).append("|");
        report.append("\n").append("-".repeat(extension));

        return report;
    }
    public abstract void doAWorkAction();
}
