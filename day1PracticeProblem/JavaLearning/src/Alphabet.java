import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a single alphabet
        System.out.print("Enter a single alphabet: ");
        char ch = scanner.next().charAt(0);

        // Check if the entered character is an alphabet
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            // Convert the character to lowercase for easier comparison
            char lowercaseCh = Character.toLowerCase(ch);

            // Check if the character is a vowel
            if (lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o'
                    || lowercaseCh == 'u') {
                System.out.println(ch + " is a vowel.");
            } else {
                System.out.println(ch + " is a consonant.");
            }
        } else {
            System.out.println("Invalid input. Please enter a single alphabet.");
        }

        // Close the scanner
        scanner.close();
    }
}
