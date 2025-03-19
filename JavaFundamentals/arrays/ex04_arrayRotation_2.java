package Arrays;

import java.util.Scanner;

public class ex04_arrayRotation_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        int rotation = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < rotation; i++) {
            String temp = input[0];

            for (int j = 0; j < input.length - 1; j++) {
                input[j] = input[j + 1];

            }
            input[input.length - 1] = temp;


        }

        for (int k = 0; k < input.length; k++) {
            System.out.print(input[k] + " ");
        }


    }
}
