public class Ex1 {

    public static void main(String[] args) {
        
        int a = 5;
        int b = -5;
        int alpha = 60;
        double dec = 6.4567;

        // Calculează pătratul unui număr.
        System.out.println(Math.pow(a, 2));

        // Găsește rădăcina pătrată a unui număr.
        System.out.println(Math.sqrt(a));

        // Calculează valoarea absolută a unui număr.
        System.out.println(Math.abs(b));

        // Găsește maximul și minimul dintre două numere.
        System.out.println(Math.min(a, b));
        System.out.println(Math.max(a, b));

        // Calculează sinusul și cosinusul unui unghi dat în radiani.
        System.out.println(Math.sin(alpha));
        System.out.println(Math.cos(alpha));

        // Găsește exponențialul și logaritmul natural al unui număr.
        System.out.println(Math.log(alpha));
        System.out.println(Math.exp(alpha));

        // Rotunjește un număr la cel mai apropiat întreg, întreg superior și întreg inferior
        System.out.println(Math.floor(dec));
        System.out.println(Math.ceil(dec));
        System.out.println(Math.round(dec));
    }
}