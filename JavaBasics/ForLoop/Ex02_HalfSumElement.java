import java.util.Scanner;

public class Ex02_HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int insert = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < insert; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (maxValue < number) {
                maxValue = number;
            }
            sum = sum + number;
        }
        sum -= maxValue;

        if (sum == maxValue) {
            System.out.println("Yes\n" + "Sum = " + sum);
        } else {
            int difference = Math.abs(sum - maxValue);
            System.out.println("No\n" + "Diff = " + difference);
        }
    }
}
