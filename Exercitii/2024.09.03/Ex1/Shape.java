
public class Shape {
    String color;
    boolean filled;

    public Shape(String color, boolean filled) {

        this.color = color;
        this.filled = filled;
    }

    public void displayDetails() {

        System.out.println("color: " + this.color);
        System.out.println("filled: " + this.filled);
    }
}