import java.util.Scanner;

public class AverageIntegerCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A: ");
        int A = sc.nextInt();
        System.out.print("Enter C: ");
        int C = sc.nextInt();

        if ((A + C) % 2 == 0) {
            int B = (A + C) / 2;
            System.out.println("Yes, B exists and B = " + B);
        } else {
            System.out.println("No,B does not exist.");
        }
    }
}