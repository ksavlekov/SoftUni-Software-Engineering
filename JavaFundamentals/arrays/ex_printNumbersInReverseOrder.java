package Arrays;

import java.util.Scanner;

public class ex_printNumbersInReverseOrder {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int insert = Integer.parseInt(scanner.nextLine());

        int[] arr = new int[insert];

        for (int i = 0; i < insert; i++){

            arr[i] = Integer.parseInt(scanner.nextLine());
        }
//        int[] arr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        for (int i = insert - 1; i >= 0; i--){

            System.out.print(arr[i] + " ");
        }
    }
}
