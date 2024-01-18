package day1PracticeProblem;

import java.util.Scanner;

public class Problem2 {

    public static void Main(String[] arge) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the year in 4-digit number:");

        int year = scanner.nextInt();
        if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
            System.out.println("leap year");
        } else {
            System.out.println("not");
        }
        scanner.close();

    }
}