package PolimorfismClass;

import PolimorfismClass.Entities.Car;
import PolimorfismClass.Entities.CargoTruck;
import PolimorfismClass.Entities.Motorcycle;
import PolimorfismClass.Entities.Vehicle;

public class PrincipalVehicleProgram {
    public static void startProgram(){
        Car car = new Car("Toyota", 2024);
        Motorcycle motorcycle = new Motorcycle("Italika", 2023);
        CargoTruck cargoTruck = new CargoTruck("Cargo Truck", 2020, 20);

        car.drive();
        car.accelerate();
        car.turn(20);

        motorcycle.drive();
        motorcycle.accelerate();
        motorcycle.turn(10);

        System.out.println(cargoTruck.getChargeCapacity());
    }
}
