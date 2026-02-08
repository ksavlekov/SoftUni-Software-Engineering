package TextProcessingAndRegularExpressions;

import java.util.Scanner;

public class Ex03ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String exit = "";
        String reverse = "";

        while(!input.equals("end")) {

            exit = input;

            String string=input;
            reverse = new StringBuffer(string).reverse().toString();

            input = scanner.nextLine();

            System.out.println(exit + " = " + reverse);

        }


    }
}
