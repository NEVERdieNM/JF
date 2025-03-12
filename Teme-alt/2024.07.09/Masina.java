public class Masina {
    
    String marca;
    String model;

    private int viteza;

    public Masina( String marca, String model) {

    }

    public void setViteza(int viteza) {
        if (viteza >= 0 && viteza <= 200)
            this.viteza = viteza;
    }

    public void printViteza() {
        System.out.println(this.viteza);
    }

    public static void main(String[] args) {
        
    }
}
