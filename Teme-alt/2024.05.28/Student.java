public class Student {
    String nume;
    int varsta;
    double nota;

    public Student(String nume, int varsta, double nota) {
        this.nume = nume;
        this.varsta = varsta;
        this.nota = nota;
    }

    public void afiseazaDetalii() {
        System.out.printf("Nume: %s\n", this.nume);
        System.out.printf("Varsta: %d\n", this.varsta);
        System.out.printf("Nota: %f\n", this.nota);
    }

    public static void main(String[] args) {
        
        Student student = new Student("Mark", 15, 9.7);
        student.afiseazaDetalii();
    }
}
