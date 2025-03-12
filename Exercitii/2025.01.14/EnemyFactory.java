public class EnemyFactory {
    
    public static Enemy get(String enemyStr) {
        enemyStr = enemyStr.toUpperCase();
        if(enemyStr == "BIG") 
        {
            return new BigEnemy();
        } 
        else if(enemyStr == "MEDIUM") 
        {
            return new MediumEnemy();
        } 
        else if(enemyStr == "SMALL")
        {
            return new SmallEnemy();
        }

        return null;
    }
}
