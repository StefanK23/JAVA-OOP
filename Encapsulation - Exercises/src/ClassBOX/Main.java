package ClassBOX;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        Box box ;

        try {
             box = new Box(length,width,height);

            System.out.printf("Surface Area - %.2f%n", box.calculatedSurfaceArea());
            System.out.printf("Lateral Surface Area - %.2f%n", box.calculatedLateralSurfaceArea());
            System.out.printf("Volume – %.2f", box.calculateVolume());


        }  catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());

        }



    }
}
