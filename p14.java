class Vehicle {
    String model;

    Vehicle(String model) {
        this.model = model;
    }

    void performDrift() {
        System.out.println(model + " makes perfect drift");
    }
}

class LuxuryCar extends Vehicle {
    LuxuryCar(String model) {
        super(model);
    }

    void showSpeed() {
        System.out.println(model + " top speed 300+ kmph");
    }
}

public class Main {
    public static void main(String[] args) {
        LuxuryCar myCar = new LuxuryCar("BMW M5 CS");

        myCar.performDrift();
        myCar.showSpeed();
    }
}
