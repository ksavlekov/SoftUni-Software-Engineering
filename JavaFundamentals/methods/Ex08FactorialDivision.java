import java.util.Scanner;

public class Ex08FactorialDivision {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        double first = Double.parseDouble(scanner.nextLine());
        double second = Double.parseDouble(scanner.nextLine());

        double divisionResult = fact(first) / fact(second);

        System.out.println(String.format("%.2f",divisionResult));
    }

    public static double fact(double num) {
        double factorial = 1;

        for (int i = 2; i <= num ; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
