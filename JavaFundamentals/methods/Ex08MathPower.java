import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex08MathPower {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        int pow = Integer.parseInt(scanner.nextLine());


        DecimalFormat dm = new DecimalFormat("#.####");
        double result = pow(number, pow);
        System.out.println(dm.format(result));


    }
    public static double pow (double number, int pow) {

        double result = 1;

        for (int i = 1; i <= pow; i++) {
            result *= number;
        }
        return result;
    }
}
