package BlackJack;

/**
 * Created by Matthew on 2017-07-22.
 */
import java.util.*;

public class Deck {
    private ArrayList<Cards> deck;

    public Deck(){
        deck = new ArrayList<Cards>();
        for (Suit suit:Suit.values()){
            for (Rank rank:Rank.values()){
                deck.add(new Cards(suit, rank));
            }
        }
    }

    public void print(){
        for (Cards card: deck){
            System.out.print(card.getRank());
            System.out.println(card.getSuit());
        }
    }

    public int remainingCards(){
        return deck.size();
    }

    public void cardDealt(){
        deck.remove(0);
    }

    public void shuffle(){
        Random rdm = new Random();
        for (int i= 0; i< rdm.nextInt(90)+10; i++){
            int num = rdm.nextInt(52)+1;
            Cards thisCard = deck.get(num);
            deck.remove(num);
            deck.add(new Cards(thisCard.getSuit(), thisCard.getRank()));
        }
        System.out.println("Shuffle complete");
    }

    public boolean checkCardAvailability(Suit suit, Rank rank) {
        Cards thisCard = new Cards(suit, rank);
        for (Cards card: deck){
            if(card.getSuit().equals(thisCard.getSuit()) && card.getRank().equals(thisCard.getRank())){
                return true;
            }
        }
        return false;
    }
}
