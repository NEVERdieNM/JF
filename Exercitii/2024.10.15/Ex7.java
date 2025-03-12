public class Ex7 {
    
    enum CardSuit {
        SPADES(1), HEARTS(2), DIAMONDS(3), CLUBS(4);

        int priority;
        CardSuit(int priority) {
            this.priority = priority;
        }

        public void comparePriority(CardSuit compareTo) {
            if(this.priority < compareTo.priority) {
                System.out.println(this.toString() + " has higher priority");
            } else if(this.priority > compareTo.priority) {
                System.out.println(compareTo.toString() + " has higher priority");
            } else {
                System.out.println("equal prority");
            }
        }
    }

    public static void main(String[] args) {
        
        CardSuit suit = CardSuit.CLUBS;
        suit.comparePriority(CardSuit.DIAMONDS);
    }
}
