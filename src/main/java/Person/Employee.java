package Person;

public class Employee extends Person {
    private final String homoKey;

    public Employee(String paternalSurname, String maternalSurname, String name, String bornMonth, String bornYear, String bornDay, String homoKey) {
        super(paternalSurname, maternalSurname, name, bornMonth, bornYear, bornDay);
        this.homoKey = homoKey;
    }

    @Override
    public void getRfc() {
        String paternalLetters = this.paternalSurname.substring(0, 2);
        String maternalLetters = String.valueOf(this.maternalSurname.charAt(0));
        String bornDate = this.bornYear + this.bornMonth + this.bornDay;

        String rfc = (paternalLetters + maternalLetters + bornDate + this.homoKey).toUpperCase();
        System.out.println(rfc);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "homoKey='" + homoKey + '\'' +
                ", paternalSurname='" + paternalSurname + '\'' +
                ", maternalSurname='" + maternalSurname + '\'' +
                ", name='" + name + '\'' +
                ", bornMonth=" + bornMonth +
                ", bornYear=" + bornYear +
                ", bornDay=" + bornDay +
                '}';
    }
}
