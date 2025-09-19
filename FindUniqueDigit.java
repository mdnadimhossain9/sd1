import java.util.Scanner;

public class FindUniqueDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three digits: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int unique;
        if (a == b) {
            unique = c;
        } else if (a == c) {
            unique = b;
        } else {
            unique = a;
        }

        System.out.println("The digit that occurs exactly once is: " + unique);
    }
}