public class Circle extends Shape {
    double radius;

    public Circle(String color, boolean filled, double radius) {
        
        super(color, filled);
        this.radius = radius;
    }

    @Override
    public void displayDetails(){

        System.out.println("color: " + this.color);
        System.out.println("filled: " + this.filled);
        System.out.println("radius: " + this.radius);
    }
}