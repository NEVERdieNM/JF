public class Weapon {
    
    int damage = 0;

    public Weapon(WeaponBuilder wb) {
        this.damage = wb.damage;
    }
}
