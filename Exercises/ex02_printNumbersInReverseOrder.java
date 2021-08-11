package Arrays;

import java.util.Scanner;

public class ex02_printNumbersInReverseOrder {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int inputNumber = Integer.parseInt(scanner.nextLine());

        int[] inputArray = new int[inputNumber];

        for (int i = 0; i < inputNumber; i++) {
            int input = Integer.parseInt(scanner.nextLine());
            inputArray[i] = input;
        }

        for (int i = inputArray.length - 1; i >= 0; i--) {
            System.out.print(inputArray[i] + " ");
        }
    }
}
