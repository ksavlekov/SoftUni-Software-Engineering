package Arrays;

import java.util.Scanner;

public class ex07_maxSequenceOfEqualElements_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        /*2 1 1 2 3 3 2 2 2 1
           1 1 1 2 3 1 3 3
           4 4 4 4
           0 1 1 5 2 2 6 3 3*/

        int[] numbers = new int[input.length];

        int maxCount = 0;
        int maxIndex = 0;

        for (int w = 0; w < input.length; w++) {
            numbers[w] = Integer.parseInt(input[w]);
        }
        for (int i = 0; i < numbers.length; i++) {

            int currentCount = 0;

            for (int j = i; j < numbers.length;  j++) {
                if (numbers[i] == numbers[j]){
                    int a = numbers[i];
                    int b = numbers[j];
                    currentCount++;

                    if (currentCount > maxCount) {
                        maxCount = currentCount;
                        maxIndex = i;
                    }
                }else{
                    break;
                }
            }
        }

        for (int i = 0; i < maxCount; i++) {
            System.out.print(numbers[i + maxIndex] + " ");
        }

    }
}
