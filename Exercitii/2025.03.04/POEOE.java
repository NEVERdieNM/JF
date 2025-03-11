//Product Of Every Other Element

import java.util.Arrays;

public class POEOE {

    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5,6,7};

        int[] pArr = poeoe(arr);

        System.out.println(Arrays.toString(pArr));
    }

    public static int[] poeoe(int[] arr) {

        int[] pArr = new int[arr.length];
        Arrays.fill(pArr, 1);
        
        for (int i=0; i<arr.length; i++) {
            
            for (int j=0; j<arr.length; j++) {
                if (j == i )
                    continue;

                pArr[i] *= j+1;
            }
        }

        return pArr;
    }
}