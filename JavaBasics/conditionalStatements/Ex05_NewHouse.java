import java.util.Scanner;

public class Ex05_NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowerType = scanner.nextLine();
        int numberOfFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double roses = 5.00;
        double priceRoses = numberOfFlowers * roses;
        double dahlias = 3.80;
        double priceDahlias = numberOfFlowers * dahlias;
        double tulips = 2.80;
        double priceTulips = numberOfFlowers * tulips;
        double narcissus = 3.00;
        double priceNarcissus = numberOfFlowers * narcissus;
        double gladiolus = 2.50;
        double priceGladiolus = numberOfFlowers * gladiolus;

        double totalPrice = 0;
        double difference = 0.00;

        switch (flowerType) {
            case "Roses":
                if (numberOfFlowers > 80) {
                    totalPrice = priceRoses * 10 / 100.0;
                } else {
                    totalPrice = priceRoses;
                }
                break;
            case "Dahlias":
                if (numberOfFlowers > 90) {
                    totalPrice = priceDahlias * 15 / 100.0;
                } else {
                    totalPrice = priceDahlias;
                }
                break;
            case "Tulips":
                if (numberOfFlowers > 80) {
                    totalPrice = priceTulips * 15 / 100.0;
                } else {
                    totalPrice = priceTulips;
                }
                break;
            case "Narcissus":
                if (numberOfFlowers < 120) {
                    totalPrice = priceNarcissus * 115 / 100.0;
                } else {
                    totalPrice = priceNarcissus;
                }
                break;
            case "Gladiolus":
                if (numberOfFlowers < 80) {
                    totalPrice = priceGladiolus * 120 / 100.0;
                } else {
                    totalPrice = priceGladiolus;
                }
                break;
            default:
                if (budget >= totalPrice) {
                    System.out.printf("Hey, you have a great garden with " + "%d %s and " + "%.2f leva left.", numberOfFlowers, flowerType, budget - totalPrice);
                } else {
                    System.out.printf("Not enough money, you need %f leva more.", totalPrice - budget);
                }
        }
    }
}
