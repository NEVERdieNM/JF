import java.util.Scanner;
import java.util.HashMap;

public class App {

    static Scanner scanner;
    static HashMap<String, Card> cards;
    static ATM atm;

    public static void main(String[] args) {

        scanner = new Scanner(System.in);
        cards = new HashMap<>();
        atm = new ATM(scanner);

        //sample cards
        cards.put("Mark Tomescu", new Card("Mark Tomescu", "1234"));
        cards.put("Sofia Kremer", new Card("Sofia Kremer", "0709"));

        while (true) {
            
            //Get user option
            System.out.print("1. load card\n2. create card\n\n>");
            int option = scanner.nextInt();

            //load card
            if (option == 1) {

                //Get card name
                System.out.print("enter name on card: ");
                clean();
                String nameLoaded = scanner.nextLine();

                //check if card exists
                if (cards.get(nameLoaded) == null) {
                    System.out.println();
                    System.out.println("no card registered to that name!\n");
                    continue;
                }

                //load card
                boolean ejected = !atm.load(cards.get(nameLoaded));

                while (!ejected) {
                    //Get user action
                    System.out.print("1.deposit\n2.withdraw\n3.transfer\n4.see balance\n5.eject\n\n>");
                    int action = scanner.nextInt();

                    System.out.println();

                    //deposit
                    if (action == 1) {
                        //amount to deposit
                        System.out.print("enter amount to deposit: ");
                        int amount = scanner.nextInt();

                        System.out.println();

                        atm.deposit(amount);
                    }
                    //withdraw
                    else if (action == 2) {
                        //amount to withdraw
                        System.out.print("enter amount to withdraw: ");
                        int amount = scanner.nextInt();

                        System.out.println();

                        atm.withdraw(amount);
                    }
                    //transfer
                    else if (action == 3) {

                        //name on card to transfer to
                        System.out.print("enter name on card to transfer to: ");
                        clean();
                        String nameTransfer = scanner.nextLine();

                        //amount to transfer
                        System.out.print("Enter transfer amount: ");
                        int transerAmount = scanner.nextInt();

                        System.out.println();

                        atm.transfer(transerAmount, cards.get(nameTransfer));
                    }
                    //see balance
                    else if (action == 4) {
                        System.out.println("balance: " + atm.loaded.balance + "\n");
                    }
                    //eject
                    else if(action == 5) {
                        atm.eject();
                        ejected = true;
                    }
                }
            }
            //create card
            else if (option == 2) {

                //Enter card holder name
                System.out.print("enter name on card: ");
                clean();
                String nameCardHolder = scanner.nextLine();

                //create password
                System.out.print("create password: ");
                String password = scanner.next();
                clean();

                System.out.println();

                if (!isValid(password)) {
                    System.out.println("password must be 4 digits long!\n");
                }

                if (cards.get(nameCardHolder) != null) {
                    System.out.println("card on this name already exists!\n");
                } else {
                    cards.put(nameCardHolder, new Card(nameCardHolder, password));
                }
            }
        }
    }

    public static void clean() {
        scanner.nextLine();
    }

    public static boolean isValid(String str) {

        if (str.length() == 4) {
            try {
                Integer.parseInt(str);
                return true;
            }catch(NumberFormatException e) {
                return false;
            } 
        }
        return false;
    }
}
