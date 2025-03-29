package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ex06_equalArrays_3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] firstArrayInput = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[] secondArrayInput = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int sum = 0;
        int count = 0;

        for (int i = 0; i < secondArrayInput.length; i++) {

            if (secondArrayInput[i] == firstArrayInput[i]) {
                sum += firstArrayInput[i];
                count++;
            } else {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                break;
            }
        }

        if (count == firstArrayInput.length) {
            System.out.printf("Arrays are identical. Sum: %d", sum);

        }


    }
}
