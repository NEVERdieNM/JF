public class Ex2 {
    
    public static void main(String[] args) {
        
        StringBuffer strBuffer = new StringBuffer("Hello");

        String str1 = "Hello";
        String str2 = "Nello";

        System.out.println(strBuffer.toString().equals(str1));
        System.out.println(strBuffer.toString().equals(str2));

    }
}
