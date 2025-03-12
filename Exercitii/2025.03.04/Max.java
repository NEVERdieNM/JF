import java.util.Arrays;

public class Max {
    
    public static void main(String[] args) {
        
        int[] arr = {-10, -3, 5, 6, -2,10};

        System.out.println(findMaxOf3(arr));
    }

    public static int findMaxOf3(int[] arr) {
        int max1 = 1;
        int max2 = 1;
        int len = arr.length;

        Arrays.sort(arr);
        reverseArray(arr);
        

        max1 = arr[0]*arr[1]*arr[2];

        max2 = arr[len-1]*arr[len-2]*arr[0];

        return Math.max(max2, max1);
    }

    public static void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            // Swap elements
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            
            left++;
            right--;
        }
    }
}
