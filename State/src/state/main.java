
package state;

public class main {

    public static void main(String[] args) {
        final PlayerContext player = new PlayerContext();
        
        player.printState();
        player.attack();
        player.defend();
        player.castSpell();
        System.out.println("");
        
        player.setState(new Intermediate());
        player.printState();
        player.attack();
        player.defend();
        player.castSpell();
        System.out.println("");
        
        player.setState(new Advanced());
        player.printState();
        player.attack();
        player.defend();
        player.castSpell();
    }
    
}
