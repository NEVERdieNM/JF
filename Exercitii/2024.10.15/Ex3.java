public class Ex3 {
    
    enum Days {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

        public void whatDay() {
            switch (this) {
                case SATURDAY:
                    System.out.println("Este weekend!");
                    break;
                case SUNDAY:
                    System.out.println("Este weekend!");
                    break;
                default:
                System.out.println("Este o zi lucrătoare");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        
        Days day = Days.MONDAY;
        day.whatDay();
    }
}
