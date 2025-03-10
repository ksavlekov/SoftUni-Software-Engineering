package Arrays;

import java.util.Scanner;

public class ex01_train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(scanner.nextLine());

            ar[i] = input;
            sum += input;

        }

        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");

        }
        System.out.println();
        System.out.println(sum);
    }
}
