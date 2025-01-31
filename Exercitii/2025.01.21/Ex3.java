public class Ex3 {
    //3. Write a Java program to find the duplicate values of an array of string values.

    public static void main(String[] args) {
        
        String[] strArr = {"casa", "padure", "vaza", "mar", "casa"};

        Boolean duplicate = false;
        for(int i=0; i<strArr.length; i++){
            for(int j=i+1; j<strArr.length; j++) {
                if(strArr[i].equals(strArr[j])) {
                    duplicate = true;
                }
            }
        }
        if(duplicate){
            System.out.println("Duplicate");
        } else {
            System.out.println("No duplicates");
        }
    }
}