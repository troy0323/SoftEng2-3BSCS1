public class Archer implements Character {
    private AttackStrategy attackStrategy;
    private DefenseStrategy defenseStrategy;

    public Archer() {
        this.attackStrategy = new ShootArrow();
        this.defenseStrategy = new Dodge(); 
    }

    
    public void performAttack() {
        attackStrategy.attack();
    }

    
    public void performDefense() {
        defenseStrategy.defense();
    }
}