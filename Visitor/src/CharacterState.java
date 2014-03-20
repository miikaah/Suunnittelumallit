


public interface CharacterState {
    public void attack();
    public void defend();
    public void castSpell();
    public void printState();
    public void accept(CharacterStateVisitor visitor);
}
