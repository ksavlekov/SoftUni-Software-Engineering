import java.util.Scanner;

public class Ex06_LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int secondSum = 0;
        int firstSum = 0;
        int difference = 0;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            firstSum += number;
        }

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            secondSum += number;
        }

        if (firstSum == secondSum) {
            System.out.println("Yes, sum = " + firstSum);
        } else {
            difference = Math.abs(firstSum - secondSum);
            System.out.print("No, diff = " + difference);
        }

    }
}
