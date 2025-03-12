public class Main {
    
    public static void main(String[] args) {
        
        int n = 5;
        char c = 'C';

        for (int i = 0; i < n*2; i++) {
            if (i < n) {
                for (int j = 0; j < i+1; j++) {
                    System.out.print(c);
                }
                System.out.println();
            } else {
                for (int j = 0; j < n; j++) {
                    if (j + n < i) {
                        System.out.print(" ");
                    }
                    else {
                        System.out.print(c);
                    }
                }
                System.out.println();
            }
        }

    }
}
