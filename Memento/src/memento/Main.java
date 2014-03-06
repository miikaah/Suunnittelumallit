
package memento;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean endOfGame = false;
        
        Quizzer quizzer = new Quizzer();
        Object obj = quizzer.joinGame();
        
        while (!endOfGame) {
            int guess = Integer.parseInt(scanner.nextLine());
            endOfGame = quizzer.makeGuess(obj, guess);
        }
        
    }
    
}
