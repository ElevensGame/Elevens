package Activity02;

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester
{
    /**
     * The main method in this class checks the Deck operations for consistency.
     *	@param args is not used.
     */
    public static void main() {
        String[] ranks = {"Jack", "Queen", "King", "Ten", "Nine", "Eight", "Seven", "Six", "Five", "Four", "Three", "Two", "Ace"};
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        int[] pointValues = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 , 12, 13};
        
        Deck d1 = new Deck(ranks, suits, pointValues);
        Deck d2 = new Deck(ranks, suits, pointValues);
        Deck d3 = new Deck(ranks, suits, pointValues);
    }
    
    public Deck deck1(Deck d1)
    {
        Deck d1Test = new Deck(d1);
        System.out.println("to String: \n" + d1.toString());
        System.out.println("Is the deck empty? : " + d1.isEmpty() + "...Should be false");
        System.out.println("Size of deck? : " + d1.size() + "... Should be 6 before dealt method" );
        System.out.println("Deal a card, then check size : " + d1.deal());
        System.out.println("size = " + d1.size());
    }
}
