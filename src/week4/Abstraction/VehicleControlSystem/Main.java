package week4.Abstraction.VehicleControlSystem;

abstract class Vehicle{
    abstract void start();
    abstract void stop();
}
class Car extends Vehicle{

    @Override
    void start() {
        System.out.println("Car Started");
    }

    @Override
    void stop() {
        System.out.println("Car Stopped");
    }
}
class Bike extends Vehicle{

    @Override
    void start() {
        System.out.println("Bike started");
    }

    @Override
    void stop() {
        System.out.println("Bike stopped");
    }
}
public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();
        v1.start();
        v2.start();
        v1.stop();
        v2.stop();
    }
}
