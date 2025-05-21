import java.util.Arrays;
import java.util.Scanner;

public class Ex02FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //input
        int lines = Integer.parseInt(scanner.nextLine());
        //firstArray

        for (int i = 0; i < lines; i++) {
            long[] firstArray = arrayLines(scanner, lines);

        }

    }

    public static long[] arrayLines(Scanner scanner, int lines) {
        //Array
        long[] arrayLines = new long[lines];

        int sum = 0;
        long digit = 0;

        long[] arrayData = Arrays.stream(scanner.nextLine().split(" ")).
                mapToLong(Long::parseLong).toArray();

        for (int i = 0; i < arrayLines.length; i++) {
            if (arrayData[0] > arrayData[1]) {
                digit = arrayData[0];
                while (digit > 0) {
                    sum += digit % 10;
                    digit = digit / 10;
                }
                System.out.println(sum);
                break;

            } else if (arrayData[0] < arrayData[1]) {
                digit = arrayData[1];
                while (digit > 0) {
                    sum += digit % 10;
                    digit = digit / 10;
                }
                System.out.println(sum);
                break;

            } else {
                digit = arrayData[1];
                while (digit > 0) {
                    sum += digit % 10;
                    digit = digit / 10;
                }
                System.out.println(sum);
                break;
            }
//            System.out.print(arrayData[i] + " ");
        }



        return arrayLines;
    }
}