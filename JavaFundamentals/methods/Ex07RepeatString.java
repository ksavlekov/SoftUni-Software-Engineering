import java.util.Scanner;

public class Ex07RepeatString {
    public static void main(String[] args) {

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
