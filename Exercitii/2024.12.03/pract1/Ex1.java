public class Ex1 {
    
    //1. Scrie un program care verifică dacă al treilea bit (de la dreapta la stânga) al unui număr este 1 sau 0. Numărul este dat ca input.
    public static void main(String[] args) {
        
        int n = 5;

        int mask = 0b100;
        boolean isThirdBitSet = (n & mask) != 0;
        
        System.out.println(isThirdBitSet);

        n <<= 2;
        n %= 10;
        n %= 2;

        System.out.println(n == 1);

    }
}
