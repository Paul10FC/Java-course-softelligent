package PolimorfismClass.Interfaces;

public interface Actions {
    void accelerate();
    default void turn(int degrees){
         System.out.println("The car has turned '" + degrees + "' degrees");
    }
    void brake();
}
