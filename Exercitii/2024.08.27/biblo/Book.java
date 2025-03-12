public class Book {

    private String autor, title;
    private int uid;

    public Book(String autor, String title, int uid) {
        this.autor = autor;
        this.title = title;
        this.uid = uid;
    }

    public String getAutor() {
        return this.autor;
    }

    public String getTitle() {
        return this.title;
    }

    public int getUID() {
        return this.uid;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}