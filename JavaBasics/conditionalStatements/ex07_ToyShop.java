import java.util.Scanner;

public class ex07_ToyShop {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
//      input
        double priceOfTravel = Double.parseDouble(scanner.nextLine());
        int numberOfPuzzles = Integer.parseInt(scanner.nextLine());
        int numberOfSpeakingDolls = Integer.parseInt(scanner.nextLine());
        int numberOfTeddyBears = Integer.parseInt(scanner.nextLine());
        int numbersOfMinions = Integer.parseInt(scanner.nextLine());
        int numberOfTrucks = Integer.parseInt(scanner.nextLine());


//      price of toys
        double priceOfPuzzle = 2.60;
        double priceOfSpeakingDoll = 3.00;
        double priceOfTeddyBear = 4.10;
        double priceOfMinion = 8.20;
        double priceOfTruck = 2.00;


        double sum = numberOfPuzzles * priceOfPuzzle + numberOfSpeakingDolls * priceOfSpeakingDoll + numberOfTeddyBears * priceOfTeddyBear + numbersOfMinions * priceOfMinion + numberOfTrucks * priceOfTruck;
        double numberOfToys = numberOfPuzzles + numberOfSpeakingDolls + numberOfTeddyBears + numbersOfMinions + numberOfTrucks;

        double rent10Percents = 0;
        double profit = 0;
        double moneyForExcursion = 0;
        if (numberOfToys >= 50){
            double discount25Percents = sum * 0.25;
            double discountPrice = sum - discount25Percents;

            rent10Percents = discountPrice * 0.10;
            profit = discountPrice - rent10Percents;

            moneyForExcursion = profit - priceOfTravel;

            System.out.printf("Yes! %.2f lv left.", Math.abs(moneyForExcursion));
        }else{
            rent10Percents = sum * 0.10;
            profit = sum - rent10Percents;
            moneyForExcursion = profit - priceOfTravel;

            System.out.printf("Not enough money! %.2f lv needed.", Math.abs(moneyForExcursion));
        }

    }
}
