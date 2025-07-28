package Methods;

import java.io.IOException;
import java.util.Scanner;

public class ex07_repeatString {

    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        String input = reader.readLine();
//        int count = Integer.parseInt(reader.readLine());
//
//        System.out.println(repeatString(input, count));
//    }
//
//    static String repeatString(String input, int count){
//        return input.repeat(count);
//
//
//    }

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());

        System.out.println(repeatString(input, number));
    }
    public static String repeatString(String input, int number) {

        String repeat = "";

        for (int i = 0; i < number; i++) {
            repeat += input;
        }
        return repeat;
    }
}
