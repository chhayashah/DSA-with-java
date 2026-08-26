public class Vehicle {
    String brand;
    int speed;

    public Vehicle(String brand, int speed){
        this.brand=brand;
        this.speed=speed;
    }

    public static void main(String[] args) {
        // Car c = new Car();
        // c.brand = "yamaha";
        // c.speed = 2400;
        // c.numberOfDoors = 4;
        Car c = new Car("Yamaha", 240, 4);

        System.out.println(c.brand + " " + c.speed + " " + c.numberOfDoors);
    }
}

class Car extends Vehicle {
    int numberOfDoors;

    public Car(String brand, int speed, int numberOfDoors) {
        super(brand, speed);
        this.numberOfDoors = numberOfDoors;
    }
}