import java.util.Scanner;

public class Ex06_FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fishermanBudget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermanNum = Integer.parseInt(scanner.nextLine());

        double price = 0;
        switch (season) {
            case "Spring":

                if (fishermanNum <= 6) {
                    price = 3000 * 0.9;
                    if (fishermanNum % 2 == 0) {
                        price = price * 0.95;
                    }
                } else if (fishermanNum <= 11) {
                    price = 3000 * 0.85;
                    if (fishermanNum % 2 == 0) {
                        price = price * 0.95;
                    }
                } else {
                    price = 3000 * 0.75;
                    if (fishermanNum % 2 == 0) {
                        price = price * 0.95;
                    }
                }
                break;
            case "Summer":
                if (fishermanNum <= 6) {
                    price = 4200 * 0.9;
                    if (fishermanNum % 2 == 0) {
                        price = price * 0.95;
                    }
                } else if (fishermanNum <= 11) {
                    price = 4200 * 0.85;
                    if (fishermanNum % 2 == 0) {
                        price = price * 0.95;
                    }
                } else {
                    price = 4200 * 0.75;
                    if (fishermanNum % 2 == 0) {
                        price = price * 0.95;
                    }
                }
                break;
            case "Autumn":
                if (fishermanNum >= 4 && fishermanNum <= 6) {
                    price = 4200 * 0.9;
                } else if (fishermanNum >= 7 && fishermanNum <= 11) {
                    price = 4200 * 0.85;
                } else if (fishermanNum >= 12) {
                    price = 4200 * 0.75;
                }
                break;
            case "Winter":
                if (fishermanNum <= 6) {
                    price = 2600 * 0.9;
                    if (fishermanNum % 2 == 0) {
                        price = price * 0.95;
                    }
                } else if (fishermanNum <= 11) {
                    price = 2600 * 0.85;
                    if (fishermanNum % 2 == 0) {
                        price = price * 0.95;
                    }
                } else {
                    price = 2600 * 0.75;
                    if (fishermanNum % 2 == 0) {
                        price = price * 0.95;
                    }
                }
                break;
        }
        if (fishermanBudget >= price) {
            System.out.printf("Yes! You have %.2f leva left.", fishermanBudget - price);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", price - fishermanBudget);
        }
    }
}
