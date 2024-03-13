import java.util.Scanner;

public class Ex04_EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = Integer.parseInt(scanner.nextLine());

        int currentSum = 0;
        int previousSum = 0;
        int maxDiff = Integer.MIN_VALUE;

        for (int i = 0; i < counter; i++) {
            int firstNum = Integer.parseInt(scanner.nextLine());
            int secndNum = Integer.parseInt(scanner.nextLine());

            previousSum = currentSum;

            currentSum = firstNum + secndNum;
            int diff = Math.abs(previousSum - currentSum);

            if (diff > maxDiff && i > 0 && previousSum != currentSum) {
                maxDiff = diff;
            }

        }

        if (maxDiff == Integer.MIN_VALUE) {
            System.out.printf("Yes, value=%d%n", currentSum);
        } else {
            System.out.printf("No, maxdiff=%d", maxDiff);
        }
    }
}
