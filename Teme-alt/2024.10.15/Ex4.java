public class Ex4 {
    
    enum Planet {
        Mercury, Venus, Earth, Mars, Jupiter, Saturn, Uranus, Neptune;

        double mass;
        double radius;

        public void showInfo() {
            System.out.println(this.toString());
        }

        public String toString() {
            return "mass: " + this.mass + " radius: " + this.radius;
        }
    }

    public static void main(String[] args) {
        
        Planet planet = Planet.Mars;
        planet.mass = 2.5;
        planet.showInfo();
    }
}
