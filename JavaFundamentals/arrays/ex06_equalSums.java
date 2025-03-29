package Arrays;

import java.util.Scanner;

public class ex06_equalSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        int[] num = new int[input.length];

        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(input[i]);
        }

        boolean flagHasEqualSum = false;
        for (int q = 0; q < num.length; q++) {
            int leftSum = 0, rightSum = 0;

            for (int w = q - 1; w >= 0; w--) {
                leftSum += num[w];
            }

            for (int e = q + 1; e < num.length; e++) {
                rightSum += num[e];
            }

            if (leftSum == rightSum){
                System.out.println(q);
                flagHasEqualSum = true;
                break;
            }
        }

        if (!flagHasEqualSum){
            System.out.println("no");
        }
    }
}
