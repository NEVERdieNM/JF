package stocuri;

import java.util.Scanner;
import java.io.IOException;
import java.util.Arrays;

public class StocManager 
{
    public static Produs[] stocuri = new Produs[10];
    public static String instructiuni =     "Instructiuni:\n" +
                                            "1. pentru a iesi din program apasati <q>.\n" +
                                            "2. pentru a afisa stocurile folositi comanda <ls>.\n" +
                                            "3. pentru a modifica stocul unui produs folositi comanda <update> urmata de indexul produsului pe care il puteti afla folosind <ls>.\n" + 
                                            "4. pentru a sterge un stoc folositi comanda <rm> urmata de indexul produsului pe care vreti sa il stergeti.\n" +
                                            "5. pentru a curata terminalul folositi comanda <cls>.\n" +
                                            "6. pentru a afisa instructiunile folositi comanda <help>.\n" +
                                            "7. pentru a afisa doar comenzile folositi comanda <commands>" +
                                            "\n";

    public static String[] commenzi = {"<q>","<ls>","<add>","<rm>","<update>","<cls>","<help>","<commands>"};

    public static void main(String[] args) 
    {

        Scanner scanner = new Scanner(System.in);

        System.out.println(instructiuni);
        System.out.println(Arrays.toString(commenzi));

        boolean running = true;
        while (running) 
        {
            System.out.print("~");
            String input = scanner.next();
            switch(input) 
            {
                case "q":
                    running = false;
                    break;
                case "ls":
                    afiseazaStocuri();
                    break;
                case "add":

                    int indexAdd = scanner.nextInt();
                    scanner.nextLine();
                    if (indexAdd < 0 || indexAdd >= stocuri.length)
                    {
                        System.out.println("Index invalid!");
                        break;
                    }
                    else if (stocuri[indexAdd] != null) 
                    {
                        System.out.println("indexul " + indexAdd + " este deja ocupat.");
                        break;
                    } 
                    else 
                    {
                        System.out.print("Numele noului produs: ");
                        String numeProdus = scanner.nextLine();

                        System.out.print("Stocul initial: ");
                        int stocInitial = scanner.nextInt();

                        stocuri[indexAdd] = new Produs(numeProdus, stocInitial);
                    }
                    break;
                case "update":
                    int indexM = scanner.nextInt();
                    if (indexM < 0 || indexM >= stocuri.length)
                    {
                        System.out.println("Index invalid!");
                        break;
                    } 
                    else if (stocuri[indexM] == null)
                    {
                        System.out.println("Nu exista nici-un produs la indexul " + indexM);
                    }
                    else
                    {
                        System.out.println("    <nume>    pentru a modifica numele.\n    <stoc>    pentru a seta stocul.\n    <inc>     pentru a incrementa sau decrementa stocul.");
                        String operatiune = scanner.next();
                        scanner.nextLine();
                        switch (operatiune) {
                            case "nume":
                                System.out.print("Introduce noul nume al produsului " + stocuri[indexM].getNume() + ": ");
                                String nume = scanner.nextLine();
                                stocuri[indexM].setNume(nume);
                                break;
                            case "stoc":
                                System.out.print("Introduceti noul stoc al produsului " + stocuri[indexM].getNume() + ": ");
                                int stoc = scanner.nextInt();
                                scanner.nextLine();
                                stocuri[indexM].setStoc(stoc);
                                break;
                        
                            case "inc":
                                System.out.print("Introduceti cu cat vreti sa incrementati sau decrementati stocul produsului " + stocuri[indexM].getNume() + " (ex: -3, +2...): ");
                                int inc = scanner.nextInt();
                                scanner.nextLine();
                                stocuri[indexM].incStoc(inc);
                                break;

                            default:
                                System.out.println("Operatiunea <" + operatiune + "> nu este valida.");
                                break;
                        }
                    }
                    break;
                case "rm":
                    int indexRm = scanner.nextInt();
                    scanner.nextLine();
                    if (indexRm < 0 || indexRm >= stocuri.length)
                    {
                        System.out.println("Index invalid!");
                        break;
                    }
                    else
                    {
                        System.out.print("Vrei sa stergi produsul " + stocuri[indexRm].getNume() + "?(da/nu): ");
                        String alegere = scanner.next();
                        scanner.nextLine();
                        if (alegere.toLowerCase().equals("da"))
                        {
                            String nume = stocuri[indexRm].getNume();
                            stocuri[indexRm] = null;
                            System.out.println("produsul " + nume + " a fost sters.");
                        }
                        else
                        {
                            System.out.println("produsul " + stocuri[indexRm].getNume() + " nu a fost sters.");
                        }
                    }
                    break;
                case "cls":
                    scanner.nextLine();
                    clearConsole();
                    break;
                case "help":
                    scanner.nextLine();
                    System.out.println(instructiuni + "\n" +Arrays.toString(commenzi));
                    break;
                case "commands":
                    scanner.nextLine();
                    System.out.println(Arrays.toString(commenzi));
                    break;
            }
        }

        scanner.close();
    }

    public static void afiseazaStocuri() 
    {
        System.out.println();
        for (int i = 0; i < stocuri.length; i++) 
        {
            System.out.print(i + ". ");
            if (stocuri[i] != null)
                System.out.println(stocuri[i]);
            else
                System.out.println(" ~ ");
        }
        System.out.println();
    }

    // Cod copiat de pe internet pentru a da clear la consola :)
    public static void clearConsole() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (IOException | InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
