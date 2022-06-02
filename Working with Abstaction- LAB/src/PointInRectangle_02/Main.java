package PointInRectangle_02;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        Point A = new Point(numbers[0], numbers[1]);
        Point B = new Point(numbers[2],numbers[3]);

        Rectangle rect = new Rectangle(A, B);

        int count = Integer.parseInt(scanner.nextLine());

        while (count-- > 0){
            int[] rectNums = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        Point p = new Point(rectNums[0], rectNums[1]);

        boolean isWitshIn = rect.contains(p);
            System.out.println(isWitshIn);
        }

    }
}
