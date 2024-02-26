import java.util.Scanner;

public class P05_FanShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        int count = n;

        int allSum = 0;
        while (count > 0){
            String object = scanner.nextLine();

            int price = 0;
            switch (object){
                case "hoodie":
                    price = 30;
                    break;
                case "keychain":
                    price = 4;
                    break;
                case "T-shirt":
                    price = 20;
                    break;
                case "flag":
                    price = 15;
                    break;
                case "sticker":
                    price = 1;
                    break;
            }

            allSum += price;

            count--;
        }

        int diff = Math.abs(budget - allSum);
        if (budget >= allSum){
            System.out.printf("You bought %d items and left with %d lv.", n, diff);
        } else {
            System.out.printf("Not enough money, you need %d more lv.", diff);
        }
    }
}
