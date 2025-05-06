package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ex07CondenseArrayToNumber2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        List<Integer> condensed = new ArrayList<>(input.length);


        for (int i = 0; i < input.length; i++) {
            int number = input[i];
            condensed.add(number);

        }


        for (int j = 0; j < condensed.size() - 1; j++) {

            int sum = condensed.get(j) + condensed.get(j + 1);

            condensed.add(sum);
        }

        System.out.println(condensed);


    }


}
