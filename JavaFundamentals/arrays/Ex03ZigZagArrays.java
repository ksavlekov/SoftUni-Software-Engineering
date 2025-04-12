import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex03ZigZagArrays {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(reader.readLine());

        String[] numbers = new String[n * 2];

        int index = 0;
        for (int i = 0; i < n; i++) {
            String[] input = reader.readLine().split(" ");

            if (i % 2 == 0) {
                numbers[index++] = input[0];
                numbers[index++] = input[1];
            } else {
                numbers[index++] = input[1];
                numbers[index++] = input[0];
            }
        }

        String firstOut = "";
        String secondOut = "";

        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0) {
                firstOut += numbers[i] + " ";

            } else {
                secondOut += numbers[i] + " ";
            }
        }
        System.out.println(firstOut);
        System.out.println(secondOut);
    }
}
