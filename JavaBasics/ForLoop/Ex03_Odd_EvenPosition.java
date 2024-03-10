import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Ex03_Odd_EvenPosition {
    public static void main(String[] args) {
        NumberFormat formatter = new DecimalFormat("#0.00");
        Scanner scanner = new Scanner(System.in);

        double insert = Double.parseDouble(scanner.nextLine());

        double minNumberEven = 1000000000.0;
        double minNumberOdd = 1000000000.0;
        double maxNumberEven = -1000000000.0;
        double maxNumberOdd = -1000000000.0;
        double sumEven = 0;
        double sumOdd = 0;

        for (int i = 1; i < insert; i++) {
            double number = Double.parseDouble(scanner.nextLine());
            //even numbers
            if (insert % 2 == 0) {
                //min numbers
                if (number < minNumberEven) {
                    minNumberEven = number;
                    //max numbers
                } else if (number > maxNumberEven) {
                    maxNumberEven = number;
                }
                sumEven += number;

                //odd numbers
            } else {
                //min numbers
                if (number < minNumberOdd) {
                    minNumberOdd = number;
                    //max numbers
                } else if (number > maxNumberOdd) {
                    maxNumberOdd = number;
                }
                sumOdd += number;
            }
        }
        System.out.println("OddSum=" + sumOdd);
        System.out.println("OddMin=" + minNumberOdd);
        System.out.println("OddMax=" + maxNumberOdd);
        System.out.println("EvenSum=" + sumEven);
        System.out.println("EvenMin=" + minNumberEven);
        System.out.println("EvenMax=" + maxNumberEven);
    }
}
