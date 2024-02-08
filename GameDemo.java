public class GameDemo {
    public static void main(String[] args) {
        Character knight = new Knight();
        Character wizard = new Wizard();
        Character archer = new Archer();
        
        
        knight.performAttack();
        knight.performDefense();

        wizard.performAttack();
        wizard.performDefense();

        archer.performAttack();
        archer.performDefense();
    }
}