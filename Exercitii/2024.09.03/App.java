public class App {
    
    public static void main(String[] args) {
        
        Animal animal = new Animal("a", 1);
        Dog dog = new Dog("a", 1);

        animal.makeSound();
        dog.makeSound();
        dog.print();
    }
}
