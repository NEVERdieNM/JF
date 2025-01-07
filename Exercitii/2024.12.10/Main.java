public class Main {
    
    static int i = 0;
    
    public void m() {
        class Innermain {
            public Innermain() {
                System.out.println(i);
            }
        }
        Innermain innermain = new Innermain();
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.m();
    }
}
