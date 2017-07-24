package BlackJack;

/**
 * Created by Matthew on 2017-07-23.
 */

public class testDeck {

    public static void main(String[] args){
        Deck deck = new Deck();
        System.out.println(deck.remainingCards());
        System.out.println(deck.checkCardAvailability(Suit.Diamond, Rank.Eight));
        deck.cardDealt();
        deck.shuffle();
        deck.print();
        System.out.println(deck.remainingCards());
        System.out.println();
    }
}
