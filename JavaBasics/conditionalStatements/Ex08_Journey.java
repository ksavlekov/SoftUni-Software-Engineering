import java.util.Scanner;

public class Ex08_Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        double price = 0;
        String place = "";
        String destination = "";
        if (budget <= 100) {
            destination = "Bulgaria";
            if (season.equals("summer")) {
                price = budget * 30 / 100;
                place = "Camp";
            } else if (season.equals("winter")) {
                price = budget * 70 / 100;
                place = "Hotel";
            }
        } else if (budget <= 1000) {
            destination = "Balkans";
            if (season.equals("summer")) {
                price = budget * 40 / 100;
                place = "Camp";
            } else if (season.equals("winter")) {
                price = budget * 80 / 100;
                place = "Hotel";
            }
        } else if (budget > 1000) {
            destination = "Europe";
            price = budget * 90 / 100;
            place = "Hotel";
        }
        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", place, price);
    }
}