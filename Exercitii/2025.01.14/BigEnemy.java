public class BigEnemy implements Enemy{
    
    int life = 100;
    int pointsToGive = 70;
    int damage = 20;

    @Override
    public void fight(Hero hero) {
        if(life > 0) {
            hero.life -= this.damage;
        }
    }

    @Override public void takeDamage(int damage) {
        this.life -= damage;
    }

    @Override
    public int getLife() {
        return this.life;
    }

    @Override
    public int getPointsToGive() {
        return this.pointsToGive;
    }
}
