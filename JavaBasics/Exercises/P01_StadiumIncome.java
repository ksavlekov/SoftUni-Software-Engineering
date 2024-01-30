import java.util.Scanner;

public class P01_StadiumIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countSector = Integer.parseInt(scanner.nextLine());
        int capacityStadium = Integer.parseInt(scanner.nextLine());
        double priceTicket = Double.parseDouble(scanner.nextLine());

        double allIncome = capacityStadium * priceTicket;
        double singleSectorIncome = allIncome / countSector;

        double charityMoney = (allIncome - (singleSectorIncome * 0.75)) / 8;

        System.out.printf("Total income - %.2f BGN%n", allIncome);
        System.out.printf("Money for charity - %.2f BGN", charityMoney);
    }
}
