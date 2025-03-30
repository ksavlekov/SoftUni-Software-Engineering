package Arrays;

import java.util.Scanner;

public class ex06_equalSums_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int[] arrayOfNumbers = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            arrayOfNumbers[i] = Integer.parseInt(input[i]);
        }

        for (int j = 0; j < arrayOfNumbers.length; j++) {

            int leftSum = 0;
            for (int k = 0; k < j; k++) {
                leftSum += arrayOfNumbers[k];
            }

            int rightSum = 0;
            for (int l = j + 1; l < arrayOfNumbers.length; l++) {
                rightSum += arrayOfNumbers[l];
            }

            if (leftSum == rightSum){
                System.out.println(j);
                return;
            }

        }

        System.out.println("no");



    }
}
