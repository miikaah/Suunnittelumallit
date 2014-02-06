package state;

public class Intermediate implements CharacterState {

    @Override
    public void attack() {
        System.out.println("You hit the enemy causing 50 damage!");
    }

    @Override
    public void defend() {
        System.out.println("You defended with your wooden shield.");
    }

    @Override
    public void castSpell() {
        System.out.println("You cast a spell. It sets the enemy's hair on fire!");
    }
    
    @Override
    public void printState() {
        System.out.println("You are a not too bad Intermediate.");
    }
}
