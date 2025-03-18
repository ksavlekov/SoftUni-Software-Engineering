package Arrays;

import java.util.Scanner;

public class ex03_sumEvenNumbers_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
            //stream intArray
//        int[] readIntArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String[] input = scanner.nextLine().split(" ");

        int[] readIntArray = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            readIntArray[i] = Integer.parseInt(input[i]);
        }
        int sum = 0;

        for (int i = 0; i < readIntArray.length; i++) {
            if (readIntArray[i] % 2 == 0){
                sum += readIntArray[i];
            }
        }

        System.out.println(sum);
    }
}
