public class Card {
    int balance;
    String name;
    String password;

    public Card(String name, String password) {
        this.name = name;
        this.password = password;
        this.balance = 0;
    }
}
