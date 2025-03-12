import java.util.HashMap;

public class Library {
    
    static HashMap<Integer, Book> books = new HashMap<>();
    static int uidCount = 0;

    public static void main(String[] args) {        
        creazaCarte("Ion Creanga", "Povestea lui Harapalb");

    }

    public static void creazaCarte(String autor, String title) {
        Book book = new Book(autor, title, ++uidCount);
        books.put(uidCount, book);
    }
}
