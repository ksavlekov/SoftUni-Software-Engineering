package Arrays;

import java.util.Scanner;

public class ex04_reverseAnArrayOfStrings_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");

        for (int i = input.length - 1; i >= 0; i--) {
            System.out.print(input[i] + " ");
        }



    }
}
