package Arrays;

import java.util.Scanner;

public class ex05_topIntegers {

    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);


        String[] input = scanner.nextLine().split(" ");

        int[] numbers = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        for (int i = 0; i < numbers.length; i++) {

            if (numbers.length == i + 1){
                System.out.print(numbers[numbers.length - 1]);
                break;
            }
            if (numbers[i] > numbers[i + 1]){
                System.out.print(numbers[i] + " ");

            }
        }
    }
}
