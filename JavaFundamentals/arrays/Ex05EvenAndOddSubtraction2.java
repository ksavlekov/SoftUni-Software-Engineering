package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ex05EvenAndOddSubtraction2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int oddSum = 0;
        int evenSum = 0;

        for (int i = 0; i < input.length; i++) {
            int i1 = input[i];

            if (i1 % 2 == 0) {
                oddSum += i1;
            } else {
                evenSum += i1;
            }
        }

        System.out.println(oddSum - evenSum);


    }
}
