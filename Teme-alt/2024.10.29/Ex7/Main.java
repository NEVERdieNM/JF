package Ex7;

public class Main {
    
    public static void main(String[] args) throws ParolaSlabaException{
        valideazaParola("asasdadsdadsdasdd");
    }

    public static void valideazaParola(String parola) throws ParolaSlabaException{
        if (parola.length() < 8) {
            throw new ParolaSlabaException();
        } else {
            System.out.println("Parola este puternica.");
        }
    }
}
