package TextProcessingAndRegularExpressions;

import java.util.Scanner;

public class Ex01RepeatStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String[] input = sc.nextLine().split("\\s+");

        String exit = "";
        for (int i = 0; i < input.length; i++) {
            String index = input[i];
            int repeatTimes = index.length();

            for (int j = 0; j < repeatTimes; j++) {
                exit += index;
            }
        }
        System.out.println(exit);

    }
}
