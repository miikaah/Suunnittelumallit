package templatemethod;

import java.util.ArrayList;
import java.util.List;

public class Hand {

    private List<Deck> decks;
    private List<Card> hand;
    private String name;
    private int total;

    public Hand(String name, List<Deck> decks) {
        this.decks = decks;
        this.hand = new ArrayList<>();
        this.name = name;
    }

    public void drawCard() {
        Deck deck = pickDeck();
        hand.add(deck.dealCard());
        calculateTotal();
    }

    private Deck pickDeck() {
        int min = 0;
        int max = decks.size() - 1;
        return decks.get(min + (int) (Math.random() * ((max - min) + 1)));
    }

    private void calculateTotal() {
        total = 0;
        boolean hasAnAce = false;
        for (Card c : hand) {            
            int value = c.getValue();
            // In blackjack face cards are all 10
            if (value > 10) {
                total += 10;
            } else if (value == 1) {
                hasAnAce = true;
                total += value;
            } else {
                total += value;
            }
        }

        // Ace can be 1 or 11 depending on the total (only 1 ace can be 11)
        if (hasAnAce) {
            if (hand.size() > 1) {                
                if (total + 10 <= 21) {
                    total += 10;
                }
            } else {
                total += 10;
            }
        }
    }

    public int getTotal() {
        return total;
    }
    
    public int getHandSize() {
        return hand.size();
    }

    @Override
    public String toString() {
        // Output cards in hand and total
        String output = name + "'s hand: ";
        for (Card c : hand) {
            output += c.getValueAsString() + ", ";
        }
        output = output.substring(0, output.length() - 2);
        output += "\n" + name + "'s total: ";
        if (total == 21 && hand.size() == 2) {
            output += "BLACKJACK!";
        } else if (total > 21) {
            output += total + " BUST!";
        } else {
            output += total;
        }
        return output;
    }
}
