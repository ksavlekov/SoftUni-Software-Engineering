package Arrays;

import java.util.Scanner;

public class JavaEndOfFile {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = 1;
        while (scanner.hasNext()) {

            String input = scanner.nextLine();
            System.out.println(count + " " + input);

            if (input.equals("Read me until end-of-file.")) {

                break;
            }

            count++;
        }

    }
}
