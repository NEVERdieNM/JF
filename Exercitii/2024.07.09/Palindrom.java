public class Palindrom {
    
    public static void main(String[] args) {
        
        int nOriginal = 404;
        int n = nOriginal;

        int numCifre = 0;
        while (n > 0) {
            n /= 10;
            numCifre++;
        }
        n = nOriginal;

        int[] nums = new int[numCifre];

        int i = 0;
        while (n > 0) {
            nums[i] = n % 10;
            n /= 10;
            i++;
        }

        boolean palindrom = true;
        for (i = 0; i < numCifre; i++) {
            if (nums[i] != nums[numCifre - 1 - i]) {
                palindrom = false;
            }
        }

        if (palindrom) {
            System.out.println(nOriginal + " este un palindrom");
        } else {
            System.out.println(nOriginal + " nu este un palindrom");
        }
    }
}
