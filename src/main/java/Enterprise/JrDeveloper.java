package Enterprise;

public class JrDeveloper extends Employee{

    public JrDeveloper(String name, String address, int salary, POSITIONS position) {
        super(name, address, salary, position);
    }

    @Override
    public double calculateBonus() {
        return this.salary * 0.08;
    }

    @Override
    public void doAWorkAction() {
        System.out.println("The Jr Developer " + this.name + " is debugging code");
    }
}
