public class Rectangle extends Shape{
    double width, height;

    public Rectangle(String color, boolean filled, double width, double height) {

        super(color, filled);
        this.width = width;
        this.height = height;
    }

    @Override
    public void displayDetails() {

        System.out.println("color: " + this.color);
        System.out.println("filled: " + this.filled);
        System.out.println("width: " + this.width);
        System.out.println("height: " + this.height);
    }
}