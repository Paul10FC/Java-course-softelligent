package Person;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Person {
    protected String paternalSurname;
    protected String maternalSurname;
    protected String name;
    protected String bornMonth;
    protected String bornYear;
    protected String bornDay;

    public abstract void getRfc();
}
