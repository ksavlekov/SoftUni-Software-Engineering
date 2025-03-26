package Arrays;

import java.util.Scanner;

public class ex04_reverseArrayOfStrings_3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] stringInput = scanner.nextLine().split(" ");

        for (int i = stringInput.length - 1; i <= 0; i++) {

            System.out.println(stringInput[i] + " ");

        }
    }
}
