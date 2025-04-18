import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex04ArrayRotation {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] strNumbers = reader.readLine().split(" ");
        int rotation = Integer.parseInt(reader.readLine());

        rotation = rotation % strNumbers.length;

        for (int i = 0; i < rotation; i++) {
            String element = strNumbers[0];

            for (int j = 0; j <strNumbers.length - 1; j++) {
                strNumbers[j] = strNumbers[j + 1];
            }
            strNumbers[strNumbers.length - 1] = element;
        }
        for (String str : strNumbers) {
            System.out.print(str + " ");
        }
        System.out.println();
    }
}
