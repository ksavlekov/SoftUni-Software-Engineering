package Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex08_mathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DecimalFormat formatSt = new DecimalFormat("#.####");

        double firstNumber = Double.parseDouble(scanner.nextLine());
        double secondNumber = Double.parseDouble(scanner.nextLine());

        System.out.println(formatSt.format(mathPow(firstNumber, secondNumber)));
    }

    static double mathPow(double firstNumber, double secondNumber){

        return Math.pow(firstNumber, secondNumber);
    }
}
