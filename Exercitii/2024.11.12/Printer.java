public class Printer {
    
    public static <T> void printArray(T[] arr) {
        for(T e : arr) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        
        Integer[] intArr = {1,3,5,6};

        printArray(intArr);
    }
}
