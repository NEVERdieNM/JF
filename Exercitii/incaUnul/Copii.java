public class Copii {
    
    public static void main(String[] args) {
        
        int copil1 = 12;
        int copil2 = 14;

        if (copil1 > copil2) {
            int diferenta = copil1 - copil2;
            System.out.println("Copil1 este mai mare decat Copil2 cu " + diferenta + " ani");
        } else if (copil2 > copil1) {
            int diferenta = copil2 - copil1;
            System.out.println("Copil2 este mai mare decat Copil1 cu " + diferenta + " ani");
        } else {
            System.out.println("Au aceasi varsta");
        }

    }

}
