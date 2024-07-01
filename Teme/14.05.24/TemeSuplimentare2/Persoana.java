public class Persoana {
    /**
         * Scrieți o clasă în Java care reprezintă o persoană.
         * Clasa trebuie să aibă un constructor care să inițializeze numele și vârsta persoanei.
         * Implementați metode pentru a afișa detaliile persoanei
         * și pentru a verifica dacă persoana este adultă (18 ani sau mai mult).
         */

    String nume;
    int varsta;

    public Persoana(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    public void afiseazaNume() {
        System.out.println("Nume: " + this.nume);
    }

    public void afiseazaVarsta() {
        System.out.println("Varsta: " + this.varsta);
    }

    public void verificaAdult(){
        if (this.varsta >= 18) {
            System.out.println(this.nume + " Este un adult");
        } else {
            System.out.println(this.nume + " Nu este un adult");
        }
    }

    public static void main(String[] args) {
        Persoana pers1 = new Persoana("Mark", 15);
        Persoana pers2 = new Persoana("Sofia", 23);

        pers1.afiseazaNume();
        pers1.afiseazaVarsta();
        pers1.verificaAdult();

        System.out.println();

        pers2.afiseazaNume();
        pers2.afiseazaVarsta();
        pers2.verificaAdult();
    }
}
