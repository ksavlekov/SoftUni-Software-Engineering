package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex08_magicSum {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] strNumbers = reader.readLine().split(" ");
        int controlNumber = Integer.parseInt(reader.readLine());

        int[] numbers = new int[strNumbers.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(strNumbers[i]);
        }

        for (int q = 0; q < numbers.length; q++) {

            for (int w = q + 1; w < numbers.length; w++) {
                int sum = numbers[q] + numbers[w];

                if (sum == controlNumber){
                    System.out.printf("%d %d%n", numbers[q], numbers[w]);
                }
            }
        }
    }

}
