package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ex05_evenAndOddSubtraction_3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int evenSum = 0;
        int oddSum = 0;

        int[] inputArrayOfNumbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < inputArrayOfNumbers.length; i++) {
            if (inputArrayOfNumbers[i] % 2 == 0){
                evenSum += inputArrayOfNumbers[i];
            }else{
                oddSum += inputArrayOfNumbers[i];
            }
        }

        int difference = evenSum - oddSum;

        System.out.println(difference);

    }
}
