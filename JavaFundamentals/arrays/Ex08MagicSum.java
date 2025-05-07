import java.util.Scanner;

public class Ex08MagicSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] strNumbers = sc.nextLine().split(" ");
        int[] numbers = new int[strNumbers.length];

        for (int i = 0; i < strNumbers.length; i++) {
            numbers[i] = Integer.parseInt(strNumbers[i]);

        }

        int controlNumber = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < numbers.length; i++) {

            for (int j = i + 1; j < numbers.length; j++) {
                int sum = numbers[i] + numbers[j];
                if (sum == controlNumber) {
                    System.out.println(numbers[i] + " " + numbers[j]);
                }
            }
        }
    }
}
