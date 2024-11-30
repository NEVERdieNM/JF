public class ContBancar {
    double sold;

    public ContBancar(double sold) {
        this.sold = sold;
    }

    public void retrage(double suma) throws SoldInsuficientException{
        if (suma > this.sold) {
            throw new SoldInsuficientException();
        } else {
            sold -= suma;
            System.out.println("sucess");
        }
    }
}
