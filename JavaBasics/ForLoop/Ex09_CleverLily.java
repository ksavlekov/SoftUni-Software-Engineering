import java.util.Scanner;

public class Ex09_CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double priceWashingMachine = Double.parseDouble(scanner.nextLine());
        int priceToy = Integer.parseInt(scanner.nextLine());

        double totalMoney = 0;
        double totalMoney2 = 0;
        double totalMoney3 = 0;
        double money = 10;
        double money2 = 0;
        double brat = 0;
        double currentMoney = 0;
        double secondMoney = 0;
        int toys = 0;
        double saleToys = 0;
        double saveMoney = 0;
        double difference = 0;

        for (int birthdays = 1; birthdays <= age ; birthdays++) {
            if ( birthdays % 2 == 0) {
                brat += 1;
                totalMoney += money;

                if (birthdays > 3) {
                    money2 += 10;
                    totalMoney2 += money2;
                } continue;

            } else {
                toys += 1;
            }
        }
        totalMoney3 = totalMoney + totalMoney2;
        secondMoney = totalMoney3 - brat;

        saleToys = priceToy * toys * 1.0;
        saveMoney = secondMoney + saleToys;
        if (saveMoney >= priceWashingMachine) {
            difference = Math.abs(saveMoney - priceWashingMachine);
            System.out.printf("Yes! %.2f", difference);
        } else {
            difference = Math.abs(saveMoney - priceWashingMachine);
            System.out.printf("No! %.2f",difference);
        }
    }
}
