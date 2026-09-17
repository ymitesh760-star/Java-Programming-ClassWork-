class Vehicle {
    public void start() {
        System.out.println("Vehicle starts.");
    }
}

class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car starts with push-button ignition.");
    }
}

class Bike extends Vehicle {
    @Override
    public void start() {
        System.out.println("Bike starts with self-start.");
    }
}

public class VehicleOverrideDemo {
    public static void main(String[] args) {
        Vehicle[] vehicles = {new Car(), new Bike()};

        for (Vehicle vehicle : vehicles) {
            vehicle.start();
        }
    }
}
