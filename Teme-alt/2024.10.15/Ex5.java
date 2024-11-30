public class Ex5 {
    
    enum TrafficLight {
        RED, YELLOW, GREEN;

        public TrafficLight next() {

            TrafficLight next = null;

            switch (this) {
                case RED:
                    next = YELLOW;
                break;
                case YELLOW:
                    next = GREEN;
                break;
                case GREEN:
                    next = RED;
                break;
            }

            return next;
        }
    }
}
