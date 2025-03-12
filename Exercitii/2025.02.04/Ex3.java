public class Ex3 {
    
    public static void main(String[] args) {
        
        int n = 5;

        for(int i=0; i<=n; i++) {
            for(int j=5; j>=0; j--) {
                if(j > i) {
                    System.out.print(" ");
                } else {
                    if(j==0) {
                        System.out.print(0);
                    } else {
                        System.out.print(n-j+1);
                    }
                }
            }
            for(int j=5; j>0; j--) {
                if(n-j < i)
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
