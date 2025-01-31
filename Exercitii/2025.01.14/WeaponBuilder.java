public class WeaponBuilder {
    
    int damage = 0;

    public void addFlameBlade() {
        this.damage += 30;
    }

    public void addVenomSerum() {
        this.damage += 20;
    }

    public void addNails() {
        this.damage += 15;
    }

    public Weapon build() {
        return new Weapon(this);
    }
}
