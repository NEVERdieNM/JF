public class Main {

    public static void main(String[] args) {

        float[] note = new float[5];
        note[0] = 5.5f;
        note[1] = 6.5f;
        note[2] = 7.8f;
        note[3] = 8.6f;
        note[4] = 7.4f;

        medieNote(note);

    }

    public static void medieNote(float[] vec) {

        float suma = 0;
        float medie;

        for (int i = 0; i < vec.length; i++) {
            suma += vec[i];
        }

        medie = suma / vec.length;
        System.out.println("Medie: " + medie);

    }
}