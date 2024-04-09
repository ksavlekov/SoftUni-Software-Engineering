import java.util.Scanner;

public class EqualSumEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        int odd = 0;
        int even = 0;

        for (int i = firstNumber; i <= secondNumber ; i++) {
            int number = i;
            int even1 = number % 10;
            number /= 10;
            int odd1 = number % 10;
            number /= 10;
            int even2 = number % 10;
            number /= 10;
            int odd2 = number % 10;
            number /= 10;
            int even3 = number % 10;
            number /= 10;
            int odd3 = number % 10;
            number /= 10;

            even = even1 + even2 + even3;
            odd = odd1 + odd2 + odd3;

            if (odd == even) {
                System.out.printf("%d ", i);
            }
        }
    }
}
