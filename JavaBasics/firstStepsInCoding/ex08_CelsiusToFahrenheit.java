import java.util.Scanner;

public class ex08_CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double Celsius = Double.parseDouble(scanner.nextLine());
        double Fahrenheit = Celsius * 1.8 + 32;

        System.out.printf("%.2f", Fahrenheit);
    }
}
