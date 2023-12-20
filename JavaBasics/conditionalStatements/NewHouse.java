import java.util.Scanner;

public class Ex05_NewHouse2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfFlowers = scanner.nextLine();
        int flowersNum = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double rose = 5;
        double dahlias = 3.8;
        double tulips = 2.8;
        double narcissus = 3;
        double gladiolus = 2.5;

        double price = 0;

        if (typeOfFlowers.equals("Roses")) {
            price = flowersNum * rose;
        } else if (typeOfFlowers.equals("Dahlias")) {
            price = flowersNum * dahlias;
        } else if (typeOfFlowers.equals("Tulips")) {
            price = flowersNum * tulips;
        } else if (typeOfFlowers.equals("Narcissus")) {
            price = flowersNum * narcissus;
        } else if (typeOfFlowers.equals("Gladiolus")) {
            price = flowersNum * gladiolus;
        }

        if (flowersNum > 80 && typeOfFlowers.equals("Roses")) {
            price = price * 0.9;
        } else if (flowersNum > 90 && typeOfFlowers.equals("Dahlias")) {
            price = price * 0.85;
        } else if (flowersNum > 80 && typeOfFlowers.equals("Tulips")) {
            price = price * 0.85;
        } else if (flowersNum < 120 && typeOfFlowers.equals("Narcissus")) {
            price = price * 1.15;
        } else if (flowersNum < 80 && typeOfFlowers.equals("Gladiolus")) {
            price = price * 1.2;
        }

        if (budget >= price) {
            System.out.printf("Hey, you have a great garden with " +
                            "%d %s and " +
                            "%.2f leva left.",
                    flowersNum, typeOfFlowers, budget - price);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", price - budget);
        }
    }
}
