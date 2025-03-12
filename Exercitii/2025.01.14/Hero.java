public class Hero {

    int life = 100;
    int points = 0;
    Weapon weapon;

    public void fight(Enemy enemy) {
        if (life > 0){
            enemy.takeDamage(weapon.damage);
            if (enemy.getLife() <= 0) {
                this.points += enemy.getPointsToGive();
                System.out.println("Enemy defeated.");
                System.out.println("Hero points: " + this.points);
            }
        } else {
            System.out.println("Your hero is dead.");
        }
    }

    public void heal() {
        life += 30;
        if(life > 100)
            life = 100;
    }
}