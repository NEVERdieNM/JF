import java.util.Scanner;

public class ATM {

    Card loaded;
    Scanner scanner;

    public ATM(Scanner scanner) {
        this.loaded = null;
        this.scanner = scanner;
    }

    public boolean load(Card card) {

        if (loaded != null) {
            System.out.println("failed to load card. there is a card already loaded\n");
            return false;
        }
        else if (askForPassword(card)) {
            this.loaded = card;
        }
        else {
            return false;
        }
            
        return true;
    }

    public boolean eject() {

        if (this.loaded == null) {
            System.out.println("no card loaded to eject!\n");
            return false;
        }
        System.out.println("card ejected!\n");
        this.loaded = null;  

        return true;
    }

    public boolean deposit(int amount) {

        if (this.loaded == null) {
            return false;
        }

        System.out.println("deposit successful!\n");
        this.loaded.balance += amount;
        return true;
    }

    public boolean withdraw(int amount) {

        if (this.loaded == null) {
            return false;
        }

        if (this.loaded.balance >= amount) {
            System.out.println("withdraw successful!\n");
            this.loaded.balance -= amount;
            return true;
        } 

        System.out.printf("not enough money in balance! (balance: %d)\n\n", this.loaded.balance);
        return false;
    }

    public boolean transfer(int amount, Card card) {

        if (this.loaded == card) {
            System.out.println("you can't transfer to yourself!\n");
            return false;
        }

        if (this.loaded.balance >= amount) {
            System.out.println("transfer successful!");
            this.loaded.balance -= amount;
            card.balance += amount;
            return true;
        }

        System.out.printf("transefer failed, not enough money in balance! (balance: %d)\n\n", this.loaded.balance);
        return false;
    }

    public boolean askForPassword(Card card) {
        
        System.out.print("enter password: ");
        String password = scanner.next();
        App.clean();

        System.out.println();

        if (password.equals(card.password)) {
            System.out.println("access granted!\n");
            return true;
        }

        System.out.println("access denied!\n");
        return false;
    }
}
