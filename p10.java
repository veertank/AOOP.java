public class Car {
    final int MAX_SPEED = 200;

    final void showMessage() {
        System.out.println("This is a final method.");
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        System.out.println("MAX_SPEED: " + myCar.MAX_SPEED);
        myCar.showMessage();
    }
}
