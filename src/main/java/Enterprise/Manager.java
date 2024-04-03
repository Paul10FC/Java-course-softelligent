package Enterprise;

public class Manager extends Employee{
    int quantityPeopleToManage;
    public Manager(String name, String address, int salary, POSITIONS position, int quantityPeopleToManage) {
        super(name, address, salary, position);
        this.quantityPeopleToManage = quantityPeopleToManage;
    }

    @Override
    public double calculateBonus() {
        return this.salary * 0.15;
    }

    @Override
    public void doAWorkAction() {
        System.out.println("The Manager " + this.name + " is doing the project administration");
    }

    @Override
    public String toString() {
        return "Manager{" +
                "quantityPeopleToManage=" + quantityPeopleToManage +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                ", position=" + position +
                '}';
    }
}
