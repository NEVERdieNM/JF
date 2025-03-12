//4. Creează o metodă addNumbers care să accepte o listă de elemente care sunt suptipuri ale Number și să calculeze suma lor.

public class AddNumbers {
    
    public static <T extends Number> double addNumbers(T[] arr) {

        double sum = 0.0;

        for(T e : arr) {
            sum += e.doubleValue();
        }

        return sum;
    }

    public static void main(String[] args) {
        
        Integer[] ints = {1,2,3,4,5};
        System.out.println(addNumbers(ints));
    }
}
