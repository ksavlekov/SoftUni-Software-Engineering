package Arrays;

import java.util.Scanner;

public class ex03_zigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[] outputOne = new String[n];
        String[] outputTwo = new String[n];

        int count = 0;

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");

            if (count % 2 == 0){
                for (int j = 0; j < input.length - 1; j++) {
                    outputOne[i] = input[j];
                    outputTwo[i] = input[j + 1];
                }
            }else{
                for (int k = 0; k < input.length - 1; k++) {
                    outputOne[i] = input[k + 1];
                    outputTwo[i] = input[k];
                }
            }
            count++;
        }


        for (String one : outputOne) {
            System.out.print(one + " ");
        }

        System.out.println();

        for (String two : outputTwo) {
            System.out.print(two + " ");
        }
    }
}
