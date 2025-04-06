public class Garden {
    
    private double length;
    private double width;
    
    public Garden(double length, double width) {
        this.length = length;
        this.width = width;
    }
 
    public double calculateArea() {
        return length * width;
    }

    public void showGardenDetails() {
        System.out.println("Length of the garden: " + length);
        System.out.println("Width of the garden: " + width);
        System.out.println("Area of the garden: " + calculateArea());
    }

    public static void main(String[] args) {
        Garden myGarden = new Garden(5.0, 7.0);
        myGarden.showGardenDetails();
    }
}
