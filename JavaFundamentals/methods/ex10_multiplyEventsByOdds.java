package Methods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex10_multiplyEventsByOdds {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] inputNumber = reader.readLine().split("");

        int[] arrayNumber = new int[inputNumber.length];

        int sumOddNumbers = 0;
        int sumEvenNumbers = 0;

        if (!inputNumber[0].equals("-")){

            for (int i = 0; i < arrayNumber.length; i++) {
                arrayNumber[i] = Integer.parseInt(inputNumber[i]);
            }

        }else{

            for (int i = 1; i < arrayNumber.length; i++) {
                arrayNumber[i] = Integer.parseInt(inputNumber[i]);
            }

        }

        for (int i = 0; i < arrayNumber.length; i++) {
            if (arrayNumber[i] % 2 == 0) {
                sumOddNumbers += arrayNumber[i];
            } else {
                sumEvenNumbers += arrayNumber[i];

            }
        }

        System.out.println(sumEvenNumbers * sumOddNumbers);



    }
}
