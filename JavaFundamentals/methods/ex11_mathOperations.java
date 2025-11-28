package Methods;

import java.util.Scanner;

public class ex11_mathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int secondNumber = Integer.parseInt(scanner.nextLine());


        System.out.println(calculate(firstNumber, operator, secondNumber));
    }

    static double calculate(int firstNumber, String operator, int secondNumber) {
        double result = 0;

        switch (operator) {
            case ("+"):

                result = firstNumber + secondNumber;
                break;
            case ("-"):

                result = firstNumber - secondNumber;
                break;
            case ("/"):

                result = firstNumber / secondNumber;
                break;
            case ("*"):

                result = firstNumber * secondNumber;
                break;
        }

        return result;
    }
}
