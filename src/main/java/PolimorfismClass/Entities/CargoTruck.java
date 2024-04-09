package PolimorfismClass.Entities;

import PolimorfismClass.Entities.Vehicle;
import PolimorfismClass.Interfaces.CargoTransport;

public class CargoTruck extends Vehicle implements CargoTransport {
    int chargeCapacity;

    public CargoTruck(String vehicleName, int year, int chargeCapacity) {
        super(vehicleName, year);
        this.chargeCapacity = chargeCapacity;
    }

    @Override
    public int getChargeCapacity() {
        return 0;
    }
}
