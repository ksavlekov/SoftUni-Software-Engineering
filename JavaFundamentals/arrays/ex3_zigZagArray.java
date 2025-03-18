package Arrays;

import java.util.Scanner;

public class ex3_zigZagArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int inputNumber = Integer.parseInt(scanner.nextLine());

        int[] one = new int[inputNumber];
        int[] two = new int[inputNumber];

        int count = 0;

        for (int i = 0; i < inputNumber; i++) {

            String x = scanner.nextLine();
            String[] arrayInput = x.split(" ");

            for (int j = 0; j < arrayInput.length - 1; j++) {

                if (count % 2 == 0) {
                    one[i] = Integer.parseInt(arrayInput[j]);
                    two[i] = Integer.parseInt(arrayInput[j + 1]);
                } else {
                    one[i] = Integer.parseInt(arrayInput[j + 1]);
                    two[i] = Integer.parseInt(arrayInput[j]);
                }
                count++;
            }
        }

        for (int indexOne : one) {
            System.out.print(indexOne + " ");
        }

        System.out.println();

        for (int indexTwo :
                two) {
            System.out.print(indexTwo + " ");
        }
    }
}
