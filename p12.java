public class Box {
    int boxLength;
    int boxWidth;

    Box() {
        boxLength = 5;
        boxWidth = 10;
        System.out.println("Default Constructor: Length = " + boxLength + ", Width = " + boxWidth);
    }

    Box(int length, int width) {
        boxLength = length;
        boxWidth = width;
        System.out.println("Parameterized Constructor: Length = " + boxLength + ", Width = " + boxWidth);
    }
}

class Main {
    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box(7, 12);
    }
}
