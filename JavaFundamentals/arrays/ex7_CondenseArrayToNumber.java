package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ex7_CondenseArrayToNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] inputInt = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

            while(inputInt.length > 1){
                int[] condensed = new int[inputInt.length - 1];

                for (int j = 0; j < inputInt.length - 1; j++) {
                    condensed[j] = inputInt[j] + inputInt[j + 1];
                }

                inputInt = condensed;
            }
        System.out.println(inputInt[0]);


    }


}