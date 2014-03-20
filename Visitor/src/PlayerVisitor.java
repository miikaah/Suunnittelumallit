
public class PlayerVisitor implements CharacterStateVisitor {

    @Override
    public void visit(Beginner beginner) {
        System.out.println("You receive 1 bonus point!");
    }

    @Override
    public void visit(Intermediate intermediate) {
        System.out.println("You receive 2 bonus points!");
    }

    @Override
    public void visit(Advanced advanced) {
        System.out.println("You receive 3 bonus points!");
    }
    
}
