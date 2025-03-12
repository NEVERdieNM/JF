public class Main {
    
    public static void main(String[] args) throws SoldInsuficientException{
        
        ContBancar cont = new ContBancar(100);

        cont.retrage(50);
        cont.retrage(51);
    }
}
