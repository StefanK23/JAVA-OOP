package HotelReservation_04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                  String [] tokens = (scanner.nextLine().split(" "));
                  double pricePerDay = Double.parseDouble(tokens[0]);
                  int days = Integer.parseInt(tokens[1]);
                  Season season = Season.valueOf(tokens[2].toUpperCase());
                  Discount discount = Discount.parseDiscount(tokens[3]);


                  PriceCalculator calculator = new PriceCalculator(pricePerDay, days,season,discount);
        System.out.printf("%.2f%n", calculator.calculatedPrice());
    }
}
