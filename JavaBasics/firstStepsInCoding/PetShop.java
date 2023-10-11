import java.util.Scanner;

public class PetShop {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int numberOfDogs = Integer.parseInt(scanner.nextLine());
        int numberOfOthersAnimals = Integer.parseInt(scanner.nextLine());

        double dogFood = 2.50;
        double justFood = 4.00;

        double sumFoofForDogs = dogFood * numberOfDogs;
        double sumFoodForOtherAnimals = numberOfOthersAnimals * justFood;

        double allSum = sumFoodForOtherAnimals + sumFoofForDogs;

        System.out.printf("%.2f lv.", allSum);
    }
}
