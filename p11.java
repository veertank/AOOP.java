public class ShapeAreaCalculator {
    static final double PI = 3.14;

    void circleArea(float radius) {
        double area = PI * radius * radius;
        System.out.println("Area of the circle: " + area);
    }

    void squareArea(float side) {
        double area = side * side;
        System.out.println("Area of the square: " + area);
    }
}

class Main {
    public static void main(String[] args) {
        ShapeAreaCalculator calculator = new ShapeAreaCalculator();
        calculator.circleArea(4);
        calculator.squareArea(5);
    }
}
