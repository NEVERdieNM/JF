package Ex6;

public class Main {
    
    public static void main(String[] args) {
        
        //upcasting
        Pisica pisica = new Pisica();
        Animal animal = pisica;

        //downcasting
        Pisica pisica2 = (Pisica) animal;

        System.err.println(animal instanceof Pisica);
        System.err.println(pisica2 instanceof Pisica);
    }
}
