import java.util.Arrays;

public class Ex3 {
    
    public static void main(String[] args) {
        
        int[] arr = {1,0,0,2,3,0,4,0,0,5,6,7,8,0,0,9}; //{0,2,3,0,5};

        for (int i=0; i<arr.length; i++) {
            if (arr[i] == 0) {

                for (int j=(arr.length-1); j>i; j--) {
                    if (arr[j] != 0) {
                        
                        arr[i] = arr[j];
                        arr[j] = 0;

                        break;
                    }
                    
                }
                System.out.println(Arrays.toString(arr));
            }
        }

        System.out.println(Arrays.toString(arr));

    }
}
