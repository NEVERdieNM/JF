
public class Ex13 {

    public static void main(String[] args) {
        
        int[] arr = {5, 4, 5, 6, 7, 1, 2, 3, 4, 56, 46, 36, 43, 12};
        int[] secventa = {2, 3, 4};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == secventa[0]) {
                boolean gasit = true;
                for (int j = 1; j < secventa.length; j++) {
                    if (arr[i + j] != secventa[j]) {
                        gasit = false;
                        break;
                    }
                }
                if (gasit) {
                    System.out.println("Gasit: " + "[" + i + "]" + " - " + "[" + (i + secventa.length - 1) + "]");
                    break;
                }
            }
        }
    }
}