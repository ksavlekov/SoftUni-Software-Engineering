package TextProcessingAndRegularExpressions;

import java.util.Scanner;

public class Ex02Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String key = scanner.nextLine();

        String text = scanner.nextLine();

        int index = text.indexOf(key);

        while(index != -1){

            text = text.substring(0, index) + text.substring(index + key.length());

            index = text.indexOf(key);
        }

        System.out.println(text);
    }
}
