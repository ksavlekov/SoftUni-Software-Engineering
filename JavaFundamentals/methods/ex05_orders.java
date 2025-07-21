package Methods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex05_orders {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String product = reader.readLine();
        int quantity = Integer.parseInt(reader.readLine());

        double coffeePrice = 1.50;
        double waterPrice = 1.00;
        double cokePrice = 1.40;
        double snacksPrice = 2.00;

        coffee(product, quantity, coffeePrice);
        water(product, quantity, waterPrice);
        coke(product, quantity, cokePrice);
        snacks(product, quantity, snacksPrice);
    }

    static void coffee(String product, int quantity, double coffeePrice) {
        if (product.equals("coffee")) {
            System.out.printf("%.2f", quantity * coffeePrice);
        }
    }

    static void water(String product, int quantity, double waterPrice){
        if (product.equals("water")){
            System.out.printf("%.2f", quantity * waterPrice);
        }
    }

    static void coke(String product, int quantity, double cokePrice){
        if (product.equals("coke")){
            System.out.printf("%.2f", quantity * cokePrice);
        }
    }

    static void snacks(String product, int quantity, double snacksPrice){
        if (product.equals("snacks")){
            System.out.printf("%.2f", quantity * snacksPrice);
        }
    }
}
