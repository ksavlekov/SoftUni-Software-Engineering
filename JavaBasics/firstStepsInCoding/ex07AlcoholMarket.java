import java.util.Scanner;

public class ex07AlcoholMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceWhiskey = Double.parseDouble(scanner.nextLine());
        double quantityBeer = Double.parseDouble(scanner.nextLine());
        double quantityWine = Double.parseDouble(scanner.nextLine());
        double quantityRakia = Double.parseDouble(scanner.nextLine());
        double quantityWhiskey = Double.parseDouble(scanner.nextLine());

        double priceRakia = priceWhiskey/ 2;
        double priceWine = priceRakia - (0.4 * priceRakia);
        double priceBeer = priceRakia - (0.8 * priceRakia);

        double sumRakia = quantityRakia * priceRakia;
        double sumWine = quantityWine * priceWine;
        double sumBeer = priceBeer * quantityBeer;
        double sumWhiskey = quantityWhiskey * priceWhiskey;

        double totalPrice = sumRakia + sumWine + sumBeer + sumWhiskey;

        System.out.printf("%.2f", totalPrice);
    }
}
