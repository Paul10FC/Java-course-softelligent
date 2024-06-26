package Enterprise;

import lombok.ToString;

public class SrDeveloper extends Employee{
    private final String programmingLanguage;
    public SrDeveloper(String name, String address, int salary, POSITIONS position, String programmingLanguage) {
        super(name, address, salary, position);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public double calculateBonus() {
        return this.salary * 0.10;
    }

    @Override
    public StringBuilder generateReport() {
        int extension = this.name.length() + 19;
        int middlePosition = extension / 2;

        StringBuilder report = new StringBuilder();

        int nameLength = this.name.length();
        int excellentLength = "Good".length();

        int nameSpaces = Math.max(0, middlePosition - nameLength);
        int excellentSpaces = Math.max(0, extension - (nameSpaces + nameLength + excellentLength));

        report.append("-".repeat(extension)).append("\n|");
        report.append(this.name).append(" ".repeat(nameSpaces)).append("|");
        report.append("Good").append(" ".repeat(excellentSpaces)).append("|");
        report.append("\n").append("-".repeat(extension));

        return report;
    }

    @Override
    public void doAWorkAction() {
        System.out.println("The Sr Developer " + this.name + " is writing code");
    }

    @Override
    public String toString() {
        return "SrDeveloper{" +
                "programmingLanguage='" + programmingLanguage + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                ", position=" + position +
                '}';
    }
}
