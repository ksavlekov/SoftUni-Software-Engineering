import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double studio = 0;
        double apartment = 0;
        double price = 0;

        if (month.equals("May") || month.equals("October")) {
            studio = 50;
            apartment = 65;
            if (nights > 7 && nights <= 14) {
                studio *= 0.95;
            } else if (nights > 14) {
                studio *= 0.70;
                apartment *= 0.9;
            }
        } else if (month.equals("June") || month.equals("September")) {
            studio = 75.20;
            apartment = 68.70;
            if (nights > 14) {
                studio *= 0.80;
                apartment *= 0.9;
            }
        } else if (month.equals("July") || month.equals("August")) {
            studio = 76;
            apartment = 77;
            if (nights > 14) {
                apartment *= 0.9;
            }
        }
        double finalPriceForApartment = nights * apartment;
        double finalPriceForStudio = nights * studio;
        System.out.printf("Apartment: %.2f lv.%n", finalPriceForApartment);
        System.out.printf("Studio: %.2f lv.", finalPriceForStudio);
    }
}
