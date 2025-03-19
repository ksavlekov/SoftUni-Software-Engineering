package Arrays;

import java.util.Scanner;

public class ex04_arrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] stringInput = scanner.nextLine().split(" ");
        int num = Integer.parseInt(scanner.nextLine());

        int[] intArray = new int[stringInput.length];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = Integer.parseInt(stringInput[i]);

        }
        int temp = 0;



        for (int w = 0; w < num; w++) {

            temp = intArray[0];

            for (int e = 0; e < intArray.length - 1; e++) {
                intArray[e] = intArray[e + 1];

            }

            intArray[intArray.length - 1] = temp;

        }


        for (int index : intArray) {
            System.out.print(index + " ");
        }

    }
}
