package Arrays;

import java.util.Scanner;

public class ex03_sumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputStringArray = input.split(" ");

        int[] inputIntArray = new int[inputStringArray.length];

        int sum = 0;

        for (int i = 0; i < inputStringArray.length; i++) {
            int number = Integer.parseInt(inputStringArray[i]);
            for (int j = 0; j < inputIntArray.length; j++) {
                inputIntArray[i] = number;

            }
        }

        for (int k = 0; k < inputIntArray.length; k++) {
            if (inputIntArray[k] % 2 == 0){
                sum += inputIntArray[k];
            }
        }

        System.out.println(sum);
    }
}
