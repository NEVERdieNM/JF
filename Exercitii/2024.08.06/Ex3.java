public class Ex3 {
    
    public static void main(String[] args) {
        
        StringBuilder sBuilder = new StringBuilder("Hello World!");
        StringBuffer sBuffer = new StringBuffer();

        sBuilder.replace(0, 12, "Java!");
        System.out.println(sBuilder);
    }
}
