public class Angajat {
    
    int varsta, salariu;
    private int oreDeMunca;

    public Angajat(int varsta, int salariu) {
        this.varsta = varsta;
        this.salariu = salariu;
    }

    public void setOreDeMunca(int ore) {
        if (ore >= 2 && ore <= 8)
            this.oreDeMunca = ore;
        else 
            System.out.println("!Orele de munca trebuie sa fie 2 - 8 ore!");
    }

    public void printOreDeMunca() {
        System.out.println(this.oreDeMunca);
    }

    public static void main(String[] args) {
        
        Angajat angajat = new Angajat(22, 2300);
        angajat.setOreDeMunca(8);
        angajat.printOreDeMunca();
    }
}
