
public class Persoana {
    String nume;
    int varsta;

    public Persoana(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    public void afisareInfo() {

        System.out.println("Nume: " + this.nume);
        System.out.println("Varsta: " + this.varsta);
    }
}
