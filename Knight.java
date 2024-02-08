public class Knight implements Character {
    private AttackStrategy attackStrategy;
    private DefenseStrategy defenseStrategy;

    public Knight() {
        this.attackStrategy = new SwingSword();
        this.defenseStrategy = new Shield(); 
    }

    
    public void performAttack() {
        attackStrategy.attack();
    }

    
    public void performDefense() {
        defenseStrategy.defense();
    }
}