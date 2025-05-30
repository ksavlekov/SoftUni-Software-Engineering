import java.util.Scanner;

public class Ex04PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOne = Integer.parseInt(scanner.nextLine());
        int numberTwo = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = numberOne; i <= numberTwo; i++) {

            sum += i;
            System.out.printf("%d ", i);
        }
        System.out.println();
        System.out.printf("Sum: %d", sum);

    }
}
