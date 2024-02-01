import java.util.Scanner;

public class P02_BeerAndChips {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double budget = Double.parseDouble(scanner.nextLine());
        int countBeers = Integer.parseInt(scanner.nextLine());
        int countChips = Integer.parseInt(scanner.nextLine());

        double priceBeer = 1.20;

        double allBeers = countBeers * priceBeer;

        double priceChips = (allBeers * 0.45);
        double cost = allBeers + Math.ceil(priceChips * countChips);

        double diff = Math.abs(cost - budget);
        if (budget >= cost){
            System.out.printf("%s bought a snack and has %.2f leva left.", name, diff);
        } else {
            System.out.printf("%s needs %.2f more leva!", name, diff);
        }
    }
}
