import java.util.Scanner;

public class LeapYear {
    public static void main(String[] arge) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the year in 4-digit number:");

        int year = scanner.nextInt();
        if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
            System.out.println(year + " leap year");
        } else {
            System.out.println(year + " not a leap year");
        }
        scanner.close();

    }

}
