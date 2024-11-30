import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Ex8 {
    
    public static void main(String[] args) throws NumarTelefonInvalidException{
        
        verificaNumarTelefon("12345678ss");
    }

    public static void verificaNumarTelefon(String numerTelefon) throws NumarTelefonInvalidException{

        Pattern pattern = Pattern.compile("[^0-9]");
        Matcher matcher = pattern.matcher(numerTelefon);
        Boolean match = matcher.find();

        if(match || numerTelefon.length() != 10) {
            throw new NumarTelefonInvalidException();
        } else {
            System.out.println("Numar valid.");
        }
        
    }

    private static class NumarTelefonInvalidException extends Exception {}
}
