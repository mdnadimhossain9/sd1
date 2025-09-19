import java.util.Scanner;

public class CountEvenOdd {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner scanner = new Scanner(System.in);


        System.out.println(" numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }


        int evenCount = 0, oddCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of odd numbers: " + oddCount);
    }
}