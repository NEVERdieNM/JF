public class Main {
    
    public static void main(String[] args) {
        
        // Box<Integer> intB = new Box<>(5);
        // System.out.println(intB.get().getClass());

        NumericBox<Integer> intB2 = new NumericBox<Integer>(1);
        System.out.println(intB2.get());
        intB2.set(3);
        System.out.println(intB2.get());
    }
}
