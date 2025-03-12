public interface Enemy {

    public abstract void fight(Hero hero);
    public void takeDamage(int damage);

    public int getLife();
    public int getPointsToGive();
}
