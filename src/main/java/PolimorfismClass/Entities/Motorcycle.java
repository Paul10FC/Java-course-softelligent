package PolimorfismClass.Entities;

import PolimorfismClass.Interfaces.Actions;

public class Motorcycle extends Vehicle implements Actions {

    public Motorcycle(String vehicleName, int year) {
        super(vehicleName, year);
    }

    @Override
    public void accelerate() {
        System.out.println(this.vehicleName + " has accelerate");
    }

    @Override
    public void turn(int degrees) {
        Actions.super.turn(degrees);
    }

    @Override
    public void brake() {
        System.out.println(this.vehicleName + " has brake");
    }
}
