public class Printer {
    
    public void print(int color) {
        switch (color) {
            case Toner.RED:
                System.out.println("RED");
                break;
            case Toner.GREEN:
                System.out.println("GREEN");
                break;
            case Toner.BLUE:
                System.out.println("BLUE");
                break;
        }
    }
}
