import java.lang.IllegalArgumentException;

public class Ex5 {
    
    public void verificaEmail(String email) {
        if (!email.contains("@")) {
            throw new IllegalArgumentException("Email invalid: trebuie sa contina @.");
        } else {
            System.out.println("Email valid.");
        }
    }
}
