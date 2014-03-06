
package memento;

public class Quizzer {
    private int randomNumber;
    
    public Memento joinGame() {
        System.out.println("Welcome to a new game of guessing!");
        System.out.print("Guess a number between 0 - 100: ");
        randomNumber = getRandomNumber();
        return new Memento(randomNumber);
    }
    
    private int getRandomNumber() {
        int min = 0;
        int max = 100;
        return min + (int) (Math.random() * ((max - min) + 1));
    }
    
    public boolean makeGuess(Object obj, int guess) {
        Memento memento = (Memento) obj;
        if (guess == memento.getNumber()) {
            System.out.println("You guessed right! The right answer was: " + guess);
            return true;
        } else if (guess < memento.getNumber()) {
            System.out.println("The right answer is higher.");
            System.out.print("> ");
            return false;
        } else {
            System.out.println("The right answer is lower");
            System.out.print("> ");
        }
        return false;
    }
    
    private class Memento {
        private final int number;
 
        public Memento(int numberToSave) {
            number = numberToSave;
        }
 
        public int getNumber() {
            return number;
        }
    }
}
