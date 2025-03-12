public class Bisect {
    
    public static void main(String[] args) {
        
        int an = 9;

        if ( an % 4 == 0 && an % 100 != 0 || an % 400 == 0) {
            System.out.println(an + " este bisect");
        } else {
            System.out.println(an + " nu este bisect");
        }
    }
}
