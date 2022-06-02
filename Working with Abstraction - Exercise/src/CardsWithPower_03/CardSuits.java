package CardsWithPower_03;

public enum CardSuits {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    private final int suitsPower;

   CardSuits (int suitsPower){
       this.suitsPower = suitsPower;
   }

    public int getSuitsPower() {
        return suitsPower;
    }
}
