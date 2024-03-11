import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex03_Odd_EvenPosition2 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        double oddSum = 0.0;
        double oddMin = 1000000000.0;
        double oddMax = -1000000000.0;
        double evenSum = 0.0;
        double evenMin = 1000000000.0;
        double evenMax = -1000000000.0;

        if (count == 0) {
            System.out.println("OddSum=0, OddMin=No, OddMax=No, EvenSum=0, EvenMin=No, EvenMax=No");
            return;
        }

        if (count == 1) {
            double num = Double.parseDouble(scanner.nextLine());
            System.out.printf("OddSum=%s, OddMin=%s, OddMax=%s, EvenSum=0, EvenMin=No, EvenMax=No",df.format(num), df.format(num), df.format(num));
            return;
        }

        for (int i = 1; i <= count; i++) {
            double num = Double.parseDouble(scanner.nextLine());

            if (i % 2 == 0) {
                evenSum += num;

                if (num > evenMax) {
                    evenMax = num;
                }

                if (num < evenMin) {
                    evenMin = num;
                }

            } else {
                oddSum += num;

                if (num > oddMax) {
                    oddMax = num;
                }
                if (num < oddMin) {
                    oddMin = num;
                }
            }
        }

        System.out.printf("OddSum=%s, OddMin=%s, OddMax=%s, EvenSum=%s, EvenMin=%s, EvenMax=%s", df.format(oddSum), df.format(oddMin), df.format(oddMax), df.format(evenSum), df.format(evenMin), df.format(evenMax));

    }
}
