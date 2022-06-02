package CardsWithPower_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rank  = scanner.nextLine();
        String suit = scanner.nextLine();

        Card card = new Card(CardSuits.valueOf(suit), RankCards.valueOf(rank));
        System.out.printf("Card name: %s of %s; Card power: %d", rank ,suit , card.getPower());
    }
}
