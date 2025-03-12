public class Ex5 {
    
    public static void main(String[] args) {
        
        String str = "hello world";

        if (str.toUpperCase().equals(str)) {
            System.out.println(str.toLowerCase());
        } 
        else if (str.toLowerCase().equals(str)) {
            System.out.println(str.toUpperCase());
        }
        else {
            System.out.println(str);
        }
    }
}
