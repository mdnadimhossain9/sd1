import java.util.Scanner;

public class CapitalizeWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        if (word.length() == 0) {
            System.out.println("Empty input.");
        } else {
            String capitalized = word.substring(0, 1).toUpperCase() + word.substring(1);
            System.out.println("Capitalized word: " + capitalized);
        }
    }
}