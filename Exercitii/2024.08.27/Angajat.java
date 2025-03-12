public class Angajat {

    private int varsta, salariu;

    public Angajat(int salariu, int varsta){
        this.salariu = salariu;
        this.varsta = varsta;
    }

    public int getSalariu() {
        return this.salariu;
    }

    public int getVarsta() {
        return this.varsta;
    }

    public void setSalariu(int newSalariu) {
        this.salariu = newSalariu;
    }

    public void setVarsta(int newVarsta) {
        this.varsta = newVarsta;
    }
}