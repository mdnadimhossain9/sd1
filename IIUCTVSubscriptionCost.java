import java.util.Scanner;

public class IIUCTVSubscriptionCost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of friends (N): ");
        int N = scanner.nextInt();
        System.out.print("Enter cost of one subscription (X): ");
        int X = scanner.nextInt();
        int subscriptions = (N + 5) / 6;

        int totalCost = subscriptions * X;

        System.out.println("Minimum total cost: " + totalCost + " Taka");
    }
}