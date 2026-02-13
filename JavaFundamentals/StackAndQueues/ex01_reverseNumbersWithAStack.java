import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;

public class ex01_reverseNumbersWithAStack {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split("\\s+");

        ArrayDeque<String> numbers = new ArrayDeque<>();

        for (String number : input) {
            numbers.push(number);
        }

        while (!numbers.isEmpty()){
            System.out.printf("%s ", numbers.pop());
        }
    }
}
