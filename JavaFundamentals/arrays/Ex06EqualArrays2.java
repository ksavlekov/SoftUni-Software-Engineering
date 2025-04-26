package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ex06EqualArrays2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] inputOne = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[] inputTwo = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int sum = 0;


        if (Arrays.equals(inputOne, inputTwo)) {

            for (int j = 0; j < inputTwo.length; j++) {
                int j1 = inputTwo[j];
                sum += j1;
            }
        } else {

                for (int i = 0; i < inputOne.length; i++) {

                    if (inputOne[i] != inputTwo[i]) {
                        System.out.println(String.format("Arrays are not identical. Found difference at %d index.", i));
                        return;

                    }

                }
        }


        System.out.println(String.format("Arrays are identical. Sum: %d", sum));


    }
}
