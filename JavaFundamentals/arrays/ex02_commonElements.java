package Arrays;

import java.util.Scanner;

public class ex02_commonElements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputOne = scanner.nextLine().split(" ");
        String[] inputTwo = scanner.nextLine().split(" ");

        for (int i = 0; i < inputTwo.length; i++) {
            for (int j = 0; j < inputOne.length; j++) {
                if (inputOne[j].equals(inputTwo[i])){
                    System.out.print(inputOne[j] + " ");
                    break;
                }
            }
        }
    }
}
