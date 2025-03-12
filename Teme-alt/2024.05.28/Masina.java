public class Masina {
    String marca;
    String model;
    int an;

    public Masina(String marca, String model, int an) {
        this.marca = marca;
        this.model = model;
        this.an = an;
    }

    public void afiseazaDetalii() {
        System.out.printf("Marca: %s\n", this.marca);
        System.out.printf("Model: %s\n", this.model);
        System.out.printf("An: %d\n", this.an);
    }

    public static void main(String[] args) {
        
        Masina masina = new Masina("Nissan", "GTR", 1999);
        masina.afiseazaDetalii();
    }
}
