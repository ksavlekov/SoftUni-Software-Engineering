package Arrays;

import java.util.Scanner;

public class ex08_magicSum_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        int num = Integer.parseInt(scanner.nextLine());

        /*1 7 6 2 19 23
          8

          14 20 60 13 7 19 8
          27
         */

        int[] numbers = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        for (int q = 0; q < numbers.length - 1; q++) {
            for (int w = q + 1; w < numbers.length; w++) {
                if (num == (numbers[q] + numbers[w])) {
                    System.out.println(numbers[q] + " " + numbers[w]);
                }
            }

        }
    }
}
