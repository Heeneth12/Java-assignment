// Leap year Problem

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the year in 4-digit number:");

        String year = scanner.nextLine();
        int num = Integer.parseInt(year);

        if ((num % 4 == 0) && ((num % 100 != 0) || (num % 400 == 0))) {
            System.out.println(year + " is leap year");
        } else {
            System.out.println(year + "is not a leap year");
        }

        scanner.close();
    }
}
