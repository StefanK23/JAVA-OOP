package Cards;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Card Suits:");

        for (CardsSuits suits : CardsSuits.values()) {
            System.out.printf("Ordinal value: %d; Name value: %s%n", suits.ordinal(), suits);
        }
    }
}
