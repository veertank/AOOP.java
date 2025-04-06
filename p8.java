public class Rectangle {
    
    private double height;
    private double width;
    
    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }
 
    public double computeArea() {
        return height * width;
    }

    public void displayRectangleDetails() {
        System.out.println("Height of the rectangle: " + height);
        System.out.println("Width of the rectangle: " + width);
        System.out.println("Area of the rectangle: " + computeArea());
    }

    public static void main(String[] args) {
        Rectangle myRectangle = new Rectangle(5.0, 7.0);
        myRectangle.displayRectangleDetails();
    }
}
