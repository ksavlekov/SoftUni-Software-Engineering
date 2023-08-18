import java.util.Scanner;

public class ex04TailoringWorkshop2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tableCount = Integer.parseInt(scanner.nextLine());
        double tableLength = Double.parseDouble(scanner.nextLine());
        double tableWidth = Double.parseDouble(scanner.nextLine());

        double allTablesArea = tableCount * (tableLength + 2 * 0.3) * (tableWidth + 2 * 0.3);

        double allKareArea = tableCount * Math.pow(tableLength / 2, 2);
        double priceUSD = allTablesArea * 7 + allKareArea * 9;
        double priceLev = priceUSD * 1.85;

        System.out.printf("%.2f USD\n%.2f BGN", priceUSD, priceLev);
    }
}
