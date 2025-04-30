package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ex07CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[] condenseArray = new int[array.length - 1];

        int total = 0;

        for (int j = 0; j < condenseArray.length - 1; j++) {



            for (int i = 0; i < array.length - 1; i++) {

                condenseArray[i] = array[i] + array[i + 1];

            }

            total = condenseArray[j] + condenseArray[j + 1];


        }


        System.out.println(total);
    }
}
