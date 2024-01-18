// java Program to check Whether a number is Even or Odd

import java.util.Scanner;

public class Problem3 {

    public static void main(String[] arge) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to check the Even or Odd");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " is Even number..!");
        } else {
            System.out.println(num + " is Odd number.!");
        }
    }

}