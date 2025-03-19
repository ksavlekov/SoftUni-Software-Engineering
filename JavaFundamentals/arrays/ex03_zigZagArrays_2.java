package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class ex03_zigZagArrays_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        int[] newArrayOne = new int[input];
        int[] newArrayTwo = new int[input];
        int count = 0;


        for (int i = 0; i < input; i++) {
            int[] intArrayOne = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt).toArray();
            if (count % 2 == 0) {
                newArrayOne[i] += intArrayOne[1];
                newArrayTwo[i] += intArrayOne[0];
            } else {
                newArrayTwo[i] += intArrayOne[1];
                newArrayOne[i] += intArrayOne[0];
            }

            count++;

        }

        for (int j = 0; j < newArrayTwo.length; j++) {
            System.out.print(newArrayTwo[j] + " ");
        }

        System.out.println();


        for (int j = 0; j < newArrayOne.length; j++) {
            System.out.print(newArrayOne[j] + " ");
        }

    }
}
