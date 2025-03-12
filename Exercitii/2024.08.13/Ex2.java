public class Ex2 {
    
    public static void main(String[] args) {
        
        int [][] mat = {{ 1, 10, 30},
                        {45,  5, 67},
                        { 9, 78,  6}};

        System.out.println(findMax(mat));
    }

    public static int findMax(int[][] mat) {

        int max = Integer.MIN_VALUE;

        for (int subArr[] : mat) {
            for (int num : subArr) {
                max = Math.max(max, num);
            }
        }
            
        return max;
    }
}
