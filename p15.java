class Vehicle {
    void makeSound() {
        System.out.println("The vehicle makes a happy sound");
    }
}

class SportsCar extends Vehicle {
    void displayModel() {
        System.out.println("Model: M5 CS");
    }
}

class PerformanceCar extends SportsCar {
    void displayTopSpeed() {
        System.out.println("Top speed: 300+ km/h");
    }
}

public class Main {
    public static void main(String[] args) {
        PerformanceCar myCar = new PerformanceCar();
        myCar.makeSound();
        myCar.displayModel();
        myCar.displayTopSpeed();
    }
}
