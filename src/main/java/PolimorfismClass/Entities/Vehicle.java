package PolimorfismClass.Entities;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Vehicle {
    protected String vehicleName;
    protected int year;
    public void drive(){
        System.out.println(this.vehicleName + " year " + this.year + " is moving");
    }
}
