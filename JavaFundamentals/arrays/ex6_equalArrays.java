package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ex6_equalArrays {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] firstArr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[] secondArr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int firstArrSum = 0;
        int count = 0;

        for (int i = 0; i < firstArr.length; i++) {
            if (firstArr[i] != secondArr[i]) {

                System.out.printf("Arrays are not identical. Found difference at %d index", i);
                break;
            } else {

                firstArrSum += firstArr[i];
                count++;
            }
        }

        if (count == firstArr.length){
            System.out.printf("Arrays are identical. Sum: %d%n", firstArrSum);

        }


    }
}
