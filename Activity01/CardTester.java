package Activity01;

/**
 * Write a description of class CardTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CardTester
{
    private String[] ranks = {"Jack", "Queen", "King", "Ten", "Nine", "Eight", "Seven", "Six", "Five", "Four", "Three", "Two", "Ace"};
    private String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private int[] pointValues = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 , 12, 13};

    public void cardOne()
    {
        Card card1 = new Card("Jack", "Hearts", 11);

        System.out.println(" Test Suit: " + card1.suit());
        System.out.println(" Test Rank: " + card1.rank());
        System.out.println(" Test Value: " + card1.pointValue());
    }

    public void cardTwo()
    {
        Card card2 = new Card("Eight", "Clubs", 8);

        System.out.println(" Test Suit: " + card2.suit());
        System.out.println(" Test Rank: " + card2.rank());
        System.out.println(" Test Value: " + card2.pointValue());
    }

    public void cardThree()
    {
        Card card3 = new Card("King", "Spades", 13);

        System.out.println(" Test Suit: " + card3.suit());
        System.out.println(" Test Rank: " + card3.rank());
        System.out.println(" Test Value: " + card3.pointValue());
    }
}