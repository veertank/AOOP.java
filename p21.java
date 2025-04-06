final class Vehicle {
    String model;

    Vehicle(String model) {
        this.model = model;
    }

    void showDetails() {
        System.out.println("Vehicle model: " + model);
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Vehicle("BMW M5 CS");
        myCar.showDetails();
    }
}
