import java.util.Scanner;

public class Ex09PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        result(scan, input);
    }

    private static void result(Scanner scan, String input) {
        while (!"END".equals(input)) {

            String reverse = new StringBuilder(input).reverse().toString();

            if (input.equals(reverse)) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
            input = scan.nextLine();
        }
    }
}