import java.util.Scanner;

public class StorePrintArray {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("The numbers are:");
        for (int i = 0; i < 5; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}