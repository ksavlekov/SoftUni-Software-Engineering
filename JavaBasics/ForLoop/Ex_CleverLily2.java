import java.util.Scanner;

public class Ex_CleverLily2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int years = Integer.parseInt(scanner.nextLine());
        double priceWashingMachine = Double.parseDouble(scanner.nextLine());
        int priceToy = Integer.parseInt(scanner.nextLine());

        int toyCount = 0;
        int sum = 0;
        int count = 1;

        for (int i = 1; i <= years; i++) {
            if (i % 2 == 1) {
                toyCount++;
            } else {
                sum = sum + 10 * count;
                count++;
            }
        }

        int allToys = toyCount * priceToy;
        int allSum = allToys + sum - count + 1;

        if (priceWashingMachine <= allSum) {
            System.out.printf("Yes! %.2f", allSum - priceWashingMachine);
        } else {
            System.out.printf("No! %.2f", priceWashingMachine - allSum);
        }

    }
}
