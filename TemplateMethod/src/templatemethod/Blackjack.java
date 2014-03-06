package templatemethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Blackjack extends Game {

    private final int NUM_OF_DECKS = 4;
    private Scanner scanner = new Scanner(System.in);
    private List<Deck> decks;
    private Hand dealer;
    private Hand player;
    private boolean endOfGame = false;
    private boolean playerStands = false;
    private int outcome = 0;
    private final int WIN = 1, LOSS = -1;

    @Override
    void initializeGame() {
        System.out.println("*****\tTHIS IS BLACKJACK     *****");
        System.out.println("| \t     RULES:\t\t  |");
        System.out.println("| \t Face cards: 10\t\t  |");
        System.out.println("| \t   Ace: 1 or 11\t\t  |");
        System.out.println("|      Soft 17: Dealer Stands\t  |");
        System.out.println("***********************************");

        // Create decks
        decks = new ArrayList<>();
        for (int i = 1; i < NUM_OF_DECKS; i++) {
            decks.add(new Deck());
        }

        // Create players
        dealer = new Hand("Dealer", decks);
        player = new Hand("Player", decks);

        // Draw initial cards
        dealer.drawCard();
        player.drawCard();
        player.drawCard();

        // Output initial hand
        printStatus();

        // If Player gets 21 in first hand draw second card for dealer
        if (player.getTotal() == 21) {
            dealer.drawCard();
            printStatus();
        }
        endOfGame = checkStatus();
    }

    @Override
    public void makePlay() {
        final int HIT = 1, STAND = 2;
        int choice = Integer.parseInt(scanner.nextLine());

        // Player has 21. Let's not let him/her screw it up
        if (player.getTotal() == 21) {
            choice = STAND;
        }
        
        switch (choice) {
            case HIT:
                player.drawCard();
                printStatus();
                endOfGame = checkStatus();
                break;
            case STAND:
                playerStands = true;
                while (!endOfGame) {
                    dealer.drawCard();
                    printStatus();
                    endOfGame = checkStatus();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                    }
                }
                break;
        }
    }

    private boolean checkStatus() {
        if (playerStands) {
            if (player.getTotal() < dealer.getTotal() && dealer.getTotal() <= 21) {
                outcome = LOSS;
                return true;
            } else if (player.getTotal() > dealer.getTotal() && dealer.getTotal() > 16) {
                outcome = WIN;
                return true;
            } else if (player.getTotal() == dealer.getTotal() && dealer.getTotal() > 16) {
                // outcome PUSH
                return true;
            }
        }

        if (player.getTotal() == 21 || dealer.getTotal() == 21) {
            // Soft 17
            if (player.getTotal() == 21 && dealer.getTotal() >= 17) {
                // Dealer might have lucked out and got 21 aswell
                if (player.getTotal() == 21 && dealer.getTotal() != 21) {
                    outcome = WIN;
                }                
                return true;
            } else if (player.getTotal() == 21 && player.getHandSize() == 2) {
                // This means player has got blackjack
                dealer.drawCard();
                printStatus();
                if (player.getTotal() == 21 && dealer.getTotal() != 21) {
                    outcome = WIN;
                }
                return true;
            } else if (player.getTotal() == 21 && dealer.getTotal() == 21) {
                // outcome PUSH
                return true;
            }
        }

        if (player.getTotal() > 21 || dealer.getTotal() > 21) {
            if (player.getTotal() < 21) {
                outcome = WIN;
                return true;
            } else if (dealer.getTotal() < 21) {
                outcome = LOSS;
                return true;
            }
        }
        // No outcome has been reached
        if (!playerStands) {
            printOptions();
        }
        return false;
    }

    @Override
    public boolean endOfGame() {
        return endOfGame;
    }

    @Override
    public void printWinner() {
        if (outcome == WIN) {
            System.out.println("You Win!");
        } else if (outcome == LOSS) {
            System.out.println("Dealer Wins.");
        } else {
            System.out.println("Push");
        }
    }

    private void printStatus() {
        if (playerStands) {
            System.out.println("Player Stands!");
        }
        System.out.println(dealer);
        System.out.println(player);
        System.out.println("");
    }

    private void printOptions() {
        if (player.getTotal() != 21) {
            System.out.println("[1] Hit [2] Stand");
        } else {
            System.out.println("[2] Stand");
        }
    }
}
