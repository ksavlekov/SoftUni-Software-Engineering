package Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex05_orders_2 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());


        switch (product){
            case "coffee":

                isCoffee(product, quantity);

                break;
            case "water":

                isWater(product, quantity);

                break;
            case "coke":

                isCoke(product, quantity);

                break;
            case "snacks":

                isSnacks(product, quantity);

                break;
        }

    }

    static void isCoffee(String product, int quantity){
        DecimalFormat decimalFormat = new DecimalFormat("##.00");

        double coffee = 1.50;

        double sum = quantity * coffee;
        System.out.println(decimalFormat.format(sum));

    }

    static void isWater (String product, int quantity){
        DecimalFormat decimalFormat = new DecimalFormat("##.00");
        double water = 1.00;

        double sum = quantity * water;
        System.out.println(decimalFormat.format(sum));

    }

    static void isCoke (String product, int quantity){
        DecimalFormat decimalFormat = new DecimalFormat("##.00");
        double coke = 1.40;

        double sum = quantity * coke;
        System.out.println(decimalFormat.format(sum));

    }

    static void isSnacks (String product, int quantity){
        DecimalFormat decimalFormat = new DecimalFormat("##.00");
        double snacks = 2.00;

        double sum = quantity * snacks;
        System.out.println(decimalFormat.format(sum));

    }



}
