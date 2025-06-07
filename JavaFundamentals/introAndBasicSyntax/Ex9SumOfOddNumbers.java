import java.util.Scanner;

public class Ex9SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int count = 0;


        for (int i = 0; i <= number; i++) {
            for (int j = 1; j <= 100; j += 2) {

                if (count < number) {
                    System.out.println(j);
                    sum += j;
                }
                count += 1;
            }
        }
        System.out.println("Sum: " + sum);
    }
}
