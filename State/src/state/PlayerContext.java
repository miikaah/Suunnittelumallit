
package state;

public class PlayerContext implements CharacterState {
    private CharacterState currentState;
    
    public PlayerContext() {
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
