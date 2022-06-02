package CardsWithPower_03;



public class Card {

    private CardSuits cardSuits;
    private RankCards cardRank;



    public Card ( CardSuits cardSuits, RankCards cardRank){
        this.cardSuits = cardSuits;
        this.cardRank = cardRank;
    }

    public int getPower() {
        return  this.cardSuits.getSuitsPower() + this.cardRank.getPowerRank();
    }
}
