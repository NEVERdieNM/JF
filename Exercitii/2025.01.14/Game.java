public class Game {
    public static void main(String[] args) {

        Hero hero = new Hero();

        WeaponBuilder weaponBuilder = new WeaponBuilder();
        weaponBuilder.addFlameBlade();

        Weapon weapon = weaponBuilder.build();
        hero.weapon = weapon;

        Enemy enemy = EnemyFactory.get("MEDIUM");

        hero.fight(enemy);

        System.out.println("hero: " + hero.life);
        System.out.println("enemy: " + enemy.getLife());

        enemy.fight(hero);

        System.out.println("hero: " + hero.life);
        System.out.println("enemy: " + enemy.getLife());

        hero.fight(enemy);
        hero.fight(enemy);
        hero.fight(enemy);
    }
}
