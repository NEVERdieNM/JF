
public class Student extends Persoana {
    float notaFinala;

    public Student(String nume, int varsta) {
        super(nume, varsta);
    }

    @Override
    public void afisareInfo() {

        System.out.println("Nume: " + this.nume);
        System.out.println("Varsta: " + this.varsta);
        System.out.println("Nota finala: " + this.notaFinala);
    }
}
