public class Ex1 {

    public static void even(int evenNumber) throws Ex1.OddNumberException {
        if (evenNumber % 2 != 0) {
            throw new OddNumberException();
        }
    }

    public static class OddNumberException extends Exception {
        public OddNumberException() {
            super("You entered an odd number.");
        }
    }

    public static void main(String[] args) throws Ex1.OddNumberException {
        even(1);
    }
}
