import java.util.Scanner;

public class TicTacToe {

    public static char[][] table = {{'_', '_', '_'},
                                    {'_', '_', '_'},
                                    {'_', '_', '_'}};

    public static boolean gameOver = false;

    public static final char PLAYER_ONE = 'X';
    public static final char PLAYER_TWO = 'O';
    public static char previousPlayer = PLAYER_TWO;
    public static char currentPlayer = PLAYER_ONE;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // JUCATORI ISI IAU RUNDUL PANA CAND UNUL DINTRE EI A CASTIGAT
        while (!gameOver) {
            
            showTable();
            takeTurn(scanner);
            gameOver = gameOver(previousPlayer);// previousPlayer PENTRU CA IN takeTurn() currentPlayer ESTE SCHIMBAT CU previousPlayer, CEEA CE INSEAMNA CA JUCATORUL CARE A FACUT ULTIMA MUTARE ESTE previousPlayer
        }

        showTable();
        System.out.printf("\nCongrats, player %c won!\n", previousPlayer);

        scanner.close();
    }

    // JUCATORUL CURENT ISI ALEGE URMATOAREA MUTARE
    public static void takeTurn(Scanner scanner) {

        String moveChoice = null; //moveChoice TREBUIE SA FIE ALCATUIT DIN 2 CARACTERE, O CIFRA SI O LITERA. EX: 1B
        boolean validChoice = false;
        int row = 0; //RANDUL DIN table[][] PE CARE JUCATORUL CURENT VREA SA IL OCUPE
        int col = 0; //COLOANA DIN table[][] PE CARE JUCATORUL CURENT VREA SA O OCUPE

        while(!validChoice) {

            System.out.printf("\n%c: ", currentPlayer);
            moveChoice = scanner.next();

            if (moveChoice.length() != 2) {
                validChoice = false;
                System.out.println("\nInvalid choice. usage ex: 1B");
                continue;
            }

            char[] choiceArr = moveChoice.toCharArray(); // CONVERTESTE moveChoice INTR-UN ARRAY PENTRU A PUTEA ACESA CELE DOUA CARACTERE INDIVIDUAL
            // VERIFICA DACA PRIMUL CARACTER ESTE O CIFRA SI DACA AL DOILEA CARACTER ESTE O LITERA
            if (Character.isDigit(choiceArr[0]) && Character.isAlphabetic(choiceArr[1])) {

                // VERIFICA DACA CIFRA ESTE 0-2 SI DACA LITERA ESTE A,B,C,a,b SAU c.
                if ((Character.getNumericValue(choiceArr[0]) >= 0 && Character.getNumericValue(choiceArr[0]) <= 2) &&
                    ((int)choiceArr[1] >= 65 && (int)choiceArr[1] <= 67 || (int)choiceArr[1] >= 97 && (int)choiceArr[1] <= 99)) {

                    validChoice = true;
                    row = Character.getNumericValue(choiceArr[0]);

                    if (Character.isUpperCase(choiceArr[1])) 
                        col = (int)choiceArr[1] - 65;
                    else
                        col = (int)choiceArr[1] - 97;
                    

                    if (table[row][col] != '_') {
                        validChoice = false;
                        System.out.println("\nInvalid choice, spot already occupied");
                        continue;
                    }

                    break;
                } 
                else {

                    System.out.println("\nInvalid choice, digit and letter must be within range. usage ex: 1B");
                    continue;
                }
            }
            System.out.println("\nInvalid choice. usage ex: 1B");
            validChoice = false;
        }
        
        // ACTUALIZAM TABLA DE JOC CU MUTAREA JUCATORULUI CURENT
        table[row][col] = currentPlayer;

        //SCHIMBAM JUCATORUL CURENT
        char temp = currentPlayer;
        currentPlayer = previousPlayer;
        previousPlayer = temp;

    }

    // AFISEAZA TABLA DE JOC
    public static void showTable() {

        for (int i = 0; i < table.length; i++) {
            System.out.print(i + ".   ");
            for (int j = 0; j < table[0].length; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        System.out.print("     ");
        for (int i = 0; i < table.length; i++) {
            char col = (char)(65 + i);
            System.out.print(col + ".");
        }

        System.out.println();
    }

    // VERIFICA DACA UN JUCATOR SPECIFICAT ARE VREO LINIE COMPLETA
    public static boolean gameOver(char player) {

        boolean gameOver;
        gameOver = checkDiagonal(player) || checkVertical(player) || checkHorizontal(player);

        return gameOver;
    }

    // VERIFICA DACA UN JUCATOR SPECIFIC ARE VREO LINIE PE ORICARE DIN CELE DOUA DIAGONALE
    public static boolean checkDiagonal(char player) {

        boolean diagonal1 = true;
        /*  X__
         *  _X_
         *  __X  */
        boolean diagonal2 = true;
        /*  __X
         *  _X_
         *  X__  */

        for (int i = 0; i < table.length; i++) {

            // DACA table[i][j] NU CORESPUNDE CU CARACTERUL JUCATORULUI, NU AVEM O LINIE PE diagonal1
            if (table[i][i] != player) {
                diagonal1 = false;
            }
            // DACA table[i][j-1-i] NU CORESPUNDE CU CARACTERUL JUCATORULUI, NU AVEM O LINIE PE diagonal2
            if (table[i][table.length - 1 - i] != player) {
                diagonal2 = false;
            }
        }
        return diagonal1 || diagonal2;
    }

    // VERIFICA DACA UN JUCATOR SPECIFIC ARE VREO LINIE PE ORICARE DIN CELE 3 COLOANE
    public static boolean checkVertical(char player) {

        boolean vertical = true;
        
         // TRECE PRIN FIECARE COLOANA A MATRICEI table[][]
         for (int i = 0; i < table[0].length; i++) {
            for (int j = 0; j < table.length; j++) {

                // DACA GASESTE PE COLOANA UN CARACTER DIFERIT DE CEL AL JUCATORULUI, vertical ESTE FALS SI TRECE LA URMATOARE COLOANA
                if (table[j][i] != player) {

                    vertical = false;
                    break;
  
                }else{
                    vertical = true;
                }
            }
            if (vertical == true) {
                break;
            }
        }
        return vertical;
    }

    // VERIFICA DACA UN JUCATOR SPECIFIC ARE VREO LINIE PE ORICARE DIN CELE 3 RANDURI
    public static boolean checkHorizontal(char player) {

       boolean horizontal = true;

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[0].length; j++) {

                // DACA GASESTE PE RAND UN CARACTER DIFERIT DE CEL AL JUCATORULUI, vertical ESTE FALS SI TRECE LA URMATOARE COLOANA
                if (table[i][j] != player) {

                    horizontal = false;
                    break;

                }else{
                    horizontal = true;
                }
            }
            if (horizontal == true) {
                break;
            }
        }
        return horizontal;
    }
}
