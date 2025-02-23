public class Main {
    public static void main(String[] args) {
        // Test Author class
        Author author = new Author("J.K. Rowling", "jkrowling@example.com");
        System.out.println(author); // Should print: Author[name=J.K. Rowling,email=jkrowling@example.com]

        author.setEmail("newemail@example.com");
        System.out.println(author.getEmail()); // Should print: newemail@example.com

        // Test Book class
        Book book1 = new Book("978-3-16-148410-0", "Harry Potter", author, 29.99);
        System.out.println(book1); // Should print: Book[isbn=978-3-16-148410-0,name=Harry Potter,Author[name=J.K. Rowling,email=newemail@example.com]]

        Book book2 = new Book("978-3-16-148410-1", "Harry Potter 2", author, 39.99, 100);
        System.out.println(book2); // Should print: Book[isbn=978-3-16-148410-1,name=Harry Potter 2,Author[name=J.K. Rowling,email=newemail@example.com]]

        book2.setPrice(35.99);
        System.out.println(book2.getPrice()); // Should print: 35.99

        book2.setQty(150);
        System.out.println(book2.getQty()); // Should print: 150

        System.out.println(book2.getAuthorName()); // Should print: J.K. Rowling
    }
}