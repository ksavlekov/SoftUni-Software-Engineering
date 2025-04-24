import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;

public class Ex05TopIntegers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" ");

        int[] number = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            number[i] = Integer.parseInt(input[i]);

        }

        for (int i = 0; i < number.length; i++) {
            boolean isGreater = true;

            for (int j = i + 1; j < number.length; j++) {
                if (number[i] <= number[j]) {
                    isGreater = false;
                    break;

                }
            }
            if (isGreater) {
                System.out.print(number[i] + " ");
            }
        }

    }
}
