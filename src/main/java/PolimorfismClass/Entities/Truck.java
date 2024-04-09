package PolimorfismClass.Entities;

import PolimorfismClass.Interfaces.Actions;
import PolimorfismClass.Interfaces.PassengersTransport;

public class Truck extends Vehicle implements Actions, PassengersTransport {
    private final int passengersNumber;

    public Truck(String vehicleName, int year, int passengersNumber) {
        super(vehicleName, year);
        this.passengersNumber = passengersNumber;
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

    @Override
    public int getPassengersNumber() {
        return passengersNumber;
    }
}
