package Arrays;

import java.util.Scanner;

public class ex05_topIntegers_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        int[] arrayOfNumbers = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            arrayOfNumbers[i] = Integer.parseInt(input[i]);

        }

        for (int j = 0; j <= arrayOfNumbers.length - 1; j++) {

            boolean isGreater = true;
            for (int k = j + 1 ; k < arrayOfNumbers.length ;k++){

                if (arrayOfNumbers[j] <= arrayOfNumbers[k]){

                    isGreater = false;
                    break;
                }
            }

            if (isGreater){
                System.out.print(arrayOfNumbers[j] + " ");

            }


        }



    }
}
