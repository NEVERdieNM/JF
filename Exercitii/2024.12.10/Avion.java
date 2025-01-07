import java.util.ArrayList;

public class Avion {
    ArrayList<MainComponent> components = new ArrayList<>();

    byte isBuild = 0b001;
    byte isDamaged = 0b010;
    byte hasEnoughFuel = 0b100;

    byte status;

    public void addFuel() {
        status |= hasEnoughFuel;
    }

    public void repair() {
        status ^= isDamaged;
    }

    public void build() {
        status |= isBuild;

        class Fuselaz extends MainComponent {}
        class Aripa extends MainComponent {}
        class Ampenaj extends MainComponent {}

        Fuselaz fuselaz = new Fuselaz();
        Aripa aripa = new Aripa();
        Ampenaj ampenaj = new Ampenaj();

        components.add(fuselaz);
        components.add(aripa);
        components.add(ampenaj);
    }
}
