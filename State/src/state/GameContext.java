
package state;

public class GameContext implements CharacterState {
    private CharacterState currentState;
    
    public GameContext() {
        setState(new Beginner());
    }
    
    public void setState(final CharacterState newState) {
        currentState = newState;
    }

    @Override
    public void attack() {
        currentState.attack();
    }

    @Override
    public void defend() {
        currentState.defend();
    }

    @Override
    public void castSpell() {
        currentState.castSpell();
    }

    @Override
    public void printState() {
        currentState.printState();
    }
}
