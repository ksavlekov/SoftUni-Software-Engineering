import java.util.Scanner;

public class Ex02_Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String projectionType = scanner.nextLine();
        int numberOfRows = Integer.parseInt(scanner.nextLine());
        int numberOfColumns = Integer.parseInt(scanner.nextLine());
        int result = numberOfRows * numberOfColumns;

        double premiere = 12.00;
        double normal = 7.50;
        double discount = 5.00;

        double price = 0;

        if (projectionType.equals("Premiere")) {
            price = 12;

        } else if (projectionType.equals("Normal")) {
            price = 7.50;
        } else if (projectionType.equals("Discount")) {
            price = 5.00;
        }
        double totalPrice = result * price;
        System.out.printf("%.2f leva", totalPrice);
    }
}
