import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex07MaxSequenceOfEqualElements {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        String[] srtNumbers = reader.readLine().split(" ");

        int[] numbers = new int[srtNumbers.length];

        for (int i = 0; i < srtNumbers.length; i++) {
            numbers[i] = Integer.parseInt(srtNumbers[i]);

        }

        int counter = 1;
        int maxLength = 1;
        int bestIndex = 0;
        for (int i = 0; i < numbers.length - 1; i++) {

            if (numbers[i] == numbers[i + 1]) {

                counter++;
            } else {
                counter = 1;
            }

            if (counter > maxLength) {
                maxLength = counter;
                bestIndex = i + 1;
            }
        }
        int begin = (bestIndex - maxLength) + 1;

        for (int i = begin; i < begin + maxLength; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();


    }
}
