package Methods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex01_signOfIntegerNumbers {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        print(Integer.parseInt(reader.readLine()));
    }

    static void print(int intNumber) {

        if (intNumber > 0) {
            System.out.printf("The number %d is positive.", intNumber);
        } else if (intNumber < 0) {
            System.out.printf("The number %d is negative.", intNumber);
        } else {
            System.out.printf("The number %d is zero.", intNumber);
        }
    }


}
