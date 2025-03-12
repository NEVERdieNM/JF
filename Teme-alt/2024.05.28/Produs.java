public class Produs {
    String nume;
    double pret;
    int cantitate;

    public void setNume(String n) {
        this.nume = n;
    }

    public void setPret(double p) {
        this.pret = p;
    }

    public void setCantitate(int c) {
        this.cantitate = c;
    }

    public void afiseazaDetalii() {
        System.out.printf("Nume: %s\n", this.nume);
        System.out.printf("Pret: %fLei\n", this.pret);
        System.out.printf("Cantitate: %d\n", this.cantitate);
    }

    public double calculeazaValoareStoc() {
        double Total = this.pret * this.cantitate;
        return Total;
    }

    public static void main(String[] args) {
        
        Produs produs = new Produs();
        produs.setNume("Lays");
        produs.setPret(7.49);
        produs.setCantitate(46);

        produs.afiseazaDetalii();
        double Total = produs.calculeazaValoareStoc();
        System.out.println("\nTotal: " + Total + "Lei");
    }
}
