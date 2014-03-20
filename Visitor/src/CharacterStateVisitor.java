
public interface CharacterStateVisitor {
    public void visit(Beginner beginner);
    public void visit(Intermediate intermediate);
    public void visit(Advanced advanced);
}
