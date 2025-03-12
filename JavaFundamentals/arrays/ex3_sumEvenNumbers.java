package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ex3_sumEvenNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];

            if (number % 2 == 0){
                sumEven += number;
            }else{
                sumOdd += number;
            }
        }

        System.out.println(sumEven);

    }
}
