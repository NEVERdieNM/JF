public class MediumEnemy implements Enemy{
    
    int life = 100;
    int pointsToGive = 30;
    int damage = 10;

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
