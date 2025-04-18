package Arrays;

import java.util.Scanner;

public class Ex04ReverseAnArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        for (int i = input.length - 1; i >= 0; i--) {
            String s = input[i];
            System.out.print(s + " ");
        }

    }
}
