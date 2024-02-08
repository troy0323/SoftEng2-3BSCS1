public class Wizard implements Character {
    private AttackStrategy attackStrategy;
    private DefenseStrategy defenseStrategy;

    public Wizard() {
        this.attackStrategy = new CastSpell();
        this.defenseStrategy = new CreateMagic();
    }

    
    public void performAttack() {
        attackStrategy.attack();
    }

    
    public void performDefense() {
        defenseStrategy.defense();
    }
}
