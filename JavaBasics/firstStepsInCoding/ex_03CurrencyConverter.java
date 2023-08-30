import java.util.Scanner;

public class ex_03CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        String inputCurrency = scanner.nextLine();
        String outputCurrency = scanner.nextLine();

        String stBGN = "BGN";
        String stUSD = "USD";
        String stEUR = "EUR";
        String stGBP = "GBP";

        double bgn = 1;
        double bgnCurrency = number * bgn;
        double usd = 1.79549;
        double usdCurrency = bgnCurrency * usd;
        double eur = 1.95583;
        double eurCurrency = bgnCurrency * eur;
        double gbp = 2.53405;
        double gbpCurrency = bgnCurrency * gbp;

        if (inputCurrency.equalsIgnoreCase(stUSD)) {
            System.out.printf("%.2f + %s", usdCurrency, outputCurrency);
        } else if (inputCurrency.equalsIgnoreCase(stEUR)) {
            System.out.printf("%.2f = %s", eurCurrency, outputCurrency);
        } else if (inputCurrency.equalsIgnoreCase(stGBP)){}
    }
}
