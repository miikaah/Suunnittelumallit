


public class main {

    public static void main(String[] args) {
        final PlayerContext player = new PlayerContext();
        final CharacterStateVisitor visitor = new PlayerVisitor();
        
        player.printState();
        player.attack();
        player.defend();
        player.castSpell();
        player.accept(visitor);
        System.out.println("");
        
        player.setState(new Intermediate());
        player.printState();
        player.attack();
        player.defend();
        player.castSpell();
        player.accept(visitor);
        System.out.println("");
        
        player.setState(new Advanced());
        player.printState();
        player.attack();
        player.defend();
        player.castSpell();
        player.accept(visitor);
    }
    
}
