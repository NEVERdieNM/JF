public class Main {
    
    public static void main(String[] args) {
        
        Circle circle = new Circle("red", true, 3.14);
        Rectangle rect = new Rectangle("green", false, 5, 6);
        
        System.out.println("Cricle details: ");
        System.out.println();
        circle.displayDetails();

        System.out.println();

        System.out.println("Rectangle details: ");
        System.out.println();
        rect.displayDetails();
    }
}
