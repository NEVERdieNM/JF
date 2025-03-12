public class Cerc {
    double raza;

    public Cerc(double raza) {
        this.raza = raza;
    }

    public void setRaza(double raza) {

        this.raza = raza;
    }

    public double aria() {

        double arie = Math.pow(this.raza, 2) * Math.PI;
        return arie;
    }

    public double perimetru() {

        double perimetru = raza * Math.PI * 2;
        return perimetru;
    }

   public static void main(String[] args) {
    
        Cerc cerc = new Cerc(1);

        System.out.println(cerc.aria());
        System.out.println((cerc.perimetru()) + "\n");

        cerc.setRaza(2);

        System.out.println(cerc.aria());
        System.out.println((cerc.perimetru()));
    }
}