package Enterprise;

public class Manager extends Employee{
    public Manager(String name, String address, int salary, POSITIONS position) {
        super(name, address, salary, position);
    }

    @Override
    public double calculateBonus() {
        return this.salary * 0.15;
    }

    @Override
    public void doAWorkAction() {
        System.out.println("The Manager " + this.name + " is doing the project administration");
    }
}
