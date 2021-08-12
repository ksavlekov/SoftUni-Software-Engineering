package Arrays;

import java.util.Scanner;

public class ex05_evenAndOddSubtraction {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] stringArray = input.split(" ");

        int[] arrayNumber = new int[stringArray.length];

        for (int i = 0; i < stringArray.length; i++) {
            int number = Integer.parseInt(stringArray[i]);

            for (int j = 0; j < arrayNumber.length; j++) {
                 arrayNumber[i] = number;
            }
        }

        int evenSum = 0;
        int oddSum = 0;


        for (int i = 0; i < arrayNumber.length; i++) {
            if (arrayNumber[i] % 2 == 0){
                evenSum += arrayNumber[i];
            }else{
                oddSum += arrayNumber[i];
            }
        }

        int diff = evenSum - oddSum;
        System.out.println(diff);

    }


}
