import java.util.Scanner;

public class TemaSuplimentara2 {
    
    public static void main(String[] args) {

        /**Scrie un program care citește nota unui elev și afișează calificativul corespunzător 
         * (A, B, C, D, F) folosind o structură switch.
         * 
         *  ex. Nota 10 afiseaza calificativul A. 
         *  Nota 9 afiseaza calificativul A.
         *  Nota 8 afiseaza calificativul B.
         *  Nota 7 afiseaza calificativul C.
         *  Nota 6 afiseaza calificativul D.
         *  Restul notelor afiseaza calificativul F. 
        */
        
        Scanner input = new Scanner(System.in);

        int nota;
        char calificativ;

        System.out.print("\nIntroduceti nota elevului: ");
        nota = input.nextInt();

        switch(nota) {
            case 10:
                calificativ = 'A';
                break;
            case 9:
                calificativ = 'A';
                break;
            case 8:
                calificativ = 'B';
                break;
            case 7:
                calificativ = 'C';
                break;
            case 6:
                calificativ = 'D';
                break;
            default:
            calificativ = 'F';
            
        }

        System.out.println("\nCalificativul elevului este: " + calificativ);

        input.close();

    }
}
