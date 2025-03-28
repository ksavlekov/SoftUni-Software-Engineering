package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ex06_equalArrays {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] stringFirstInput = scanner.nextLine().split(" ");
        String[] stringSecondInput = scanner.nextLine().split(" ");

        int[] intFirstArray = new int[stringFirstInput.length];
        int[] intSecondArray = new int[stringSecondInput.length];

        for (int i = 0; i < intFirstArray.length; i++) {
            intFirstArray[i] = Integer.parseInt(stringFirstInput[i]);
        }

        for (int j = 0; j < intSecondArray.length; j++) {
            intSecondArray[j] = Integer.parseInt(stringSecondInput[j]);
        }

        int sum = 0;

        int[] maxLength = intFirstArray;

        if (intFirstArray.length < intSecondArray.length) {
            maxLength = intSecondArray;
        }
        for (int z = 0; z < maxLength.length; z++) {
            if (intFirstArray[z] != intSecondArray[z]) {
                System.out.printf("Arrays are not identical. Found difference at %d index.", z);
                break;
            }else{
                sum += intFirstArray[z];
            }
        }
        if (Arrays.equals(intFirstArray, intSecondArray)){
            System.out.printf("Arrays are identical. Sum: %d", sum);

        }
    }
}
