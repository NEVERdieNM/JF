public class ExA5 {
    
    public static void main(String[] args) {
        
        System.out.println(reverseString("fgh"));
    }

    public static String reverseString(String str) {

        if (str.length() == 0) {
            return "";
        }

        String reverse = "" + str.charAt(str.length()-1);

        StringBuilder strB = new StringBuilder(str);
        strB.deleteCharAt(strB.length()-1);

        reverse += reverseString(strB.toString());

        return reverse;
    }
}
