import java.util.Scanner;

public class Ex02_SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine().toLowerCase();
        String city = scanner.nextLine().toLowerCase();
        double quantity = Double.parseDouble(scanner.nextLine());

        double coffeeSofia = 0.50;
        double waterSofia = 0.80;
        double beerSofia = 1.20;
        double sweetsSofia = 1.45;
        double peanutsSofia = 1.60;

        double coffeePlovdiv = 0.40;
        double waterPlovdiv = 0.70;
        double beerPlovdiv = 1.15;
        double sweetsPlovdiv = 1.30;
        double peanutsPlovdiv = 1.50;

        double coffeeVarna = 0.45;
        double waterVarna = 0.70;
        double beerVarna = 1.10;
        double sweetsVarna = 1.35;
        double peanutsVarna = 1.55;

        double totalPrice = 0;

        if (city.equals("sofia")) {
            if (product.equals("coffee")) {
                totalPrice = coffeeSofia * quantity;
                System.out.println(totalPrice);
            } else if ("water".equals(product)) {
                totalPrice = waterSofia * quantity;
                System.out.println(totalPrice);
            } else if ("beer".equals(product)) {
                totalPrice = beerSofia * quantity;
                System.out.println(totalPrice);
            } else if ("sweets".equals(product)) {
                totalPrice = sweetsSofia * quantity;
                System.out.println(totalPrice);
            } else if ("peanuts".equals(product)) {
                totalPrice = peanutsSofia * quantity;
                System.out.println(totalPrice);
            }
        }
        if (city.equals("plovdiv")) {
            if (product.equals("coffee")) {
                totalPrice = coffeePlovdiv * quantity;
                System.out.println(totalPrice);
            } else if ("water".equals(product)) {
                totalPrice = waterPlovdiv * quantity;
                System.out.println(totalPrice);


            } else if ("beer".equals(product)) {
                totalPrice = beerPlovdiv * quantity;
                System.out.println(totalPrice);


            } else if ("sweets".equals(product)) {
                totalPrice = sweetsPlovdiv * quantity;
                System.out.println(totalPrice);

            } else if ("peanuts".equals(product)) {
                totalPrice = peanutsPlovdiv * quantity;
                System.out.println(totalPrice);
            }

        }

        if (city.equals("varna")) {
            if (product.equals("coffee")) {
                totalPrice = coffeeVarna * quantity;
                System.out.println(totalPrice);
            } else if ("water".equals(product)) {
                totalPrice = waterVarna * quantity;
                System.out.println(totalPrice);
            } else if ("beer".equals(product)) {
                totalPrice = beerVarna * quantity;
                System.out.println(totalPrice);
            } else if ("sweets".equals(product)) {
                totalPrice = sweetsVarna * quantity;
                System.out.println(totalPrice);
            } else if ("peanuts".equals(product)) {
                totalPrice = peanutsVarna * quantity;
                System.out.println(totalPrice);
            }

        }

    }
}