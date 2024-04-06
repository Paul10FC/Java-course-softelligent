package PolimorfismClass;

public class PrincipalVehicleProgram {
    public static void startProgram(){
        Vehicle car = new Car("FORD", 2023);
        Car car2 = new Car("Toyota", 2024);

        Vehicle motorcycle = new Motorcycle("Vento", 2000);
        Motorcycle motorcycle1 = new Motorcycle("Italika", 2023);

        car.drive();
        car2.drive();

        motorcycle.drive();
        motorcycle1.drive();
    }
}
