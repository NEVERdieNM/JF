public class Main {

    public static void main(String[] args) {
        
        String str1 = "Hello";
        String str2 = "hello";
        String str3 = new String("hello");

        System.out.println(str1 == str3);// verifica zona de memorie -> false
        System.out.println(str1.equals(str3));// verifica continutul stringului -> true

        System.out.println(str1.toLowerCase());
        System.out.println(str2);

        System.out.println(str1.toLowerCase() == str2);
        System.out.println(str1.toLowerCase().equals(str2));

    }
}