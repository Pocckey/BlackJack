package BlackJack;

/**
 * Created by Matthew on 2017-07-23.
 */
enum Suit {
    Diamond, Club, Heart, Spade
        }
enum Rank {
    Ace, Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King
}

public class Cards {
    private Suit suit;
    private Rank rank;

    public Cards(Suit suit, Rank rank){
        this.suit = suit;
        this.rank = rank;
    }
    public Suit getSuit(){
        return suit;
    }
    public Rank getRank(){
        return rank;
    }
}
