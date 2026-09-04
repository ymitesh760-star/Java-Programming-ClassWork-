

class Vehicle{
    String brand;
    int prize;
    int seat;
    String color;

    void displayVehicle(){
    System.out.println("sdfoiw");
    }
}

class Bike extends Vehicle{
    String name;

    void displayBike(){
    System.out.println("sdvipksvnoi");
    }
}

class Car extends Vehicle{
    String name;
    void displayCar(){
        System.out.println("dfkbn");
    }
}


class Vehicledis{
    public static void main(String[] args) {
    Car obj1 = new Car();
    obj1.name = "honda civic";
    obj1.brand = "honda";
    obj1.prize = 500000;
    obj1.seat = 4;
    Vehicle obj2 = new Bike();
    obj2.displayVehicle();

    }
} 