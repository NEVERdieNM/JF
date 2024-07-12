
public class Frecventa {
    public static void main(String[] args) {
        
        int[] arr = {5, 3, 4, 5, 4, 2, 7, 6, 5, 6, 8, 9};

        int[] nums = new int[10];

        for (int i = 0; i < arr.length; i++) {
            nums[arr[i]]++;
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(i + ": " + nums[i]);
        }
    }
}
