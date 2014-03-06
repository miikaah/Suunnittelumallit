
package templatemethod;

abstract class Game {
 
    abstract void initializeGame();
    abstract void makePlay();
    abstract boolean endOfGame();
    abstract void printWinner();
 
    /* A template method : */
    public final void playOneGame() {
        initializeGame();
        while (!endOfGame()) {
            makePlay();
        }
        printWinner();
    }
}
