import java.util.Scanner;

public class ex06_godzillaVsKong {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double movieBudget = Double.parseDouble(scanner.nextLine());
        int numberOfExtraBoy = Integer.parseInt(scanner.nextLine());
        double priceForClothesAboutOneExtraBoy = Double.parseDouble(scanner.nextLine());

        double priceForDecor = 0.1 * movieBudget;

        double priceForClothes = numberOfExtraBoy * priceForClothesAboutOneExtraBoy;

        if (numberOfExtraBoy > 150){
            priceForClothes = priceForClothes - (0.1 * priceForClothes);
        }
        double totalPriceForMovie = priceForDecor + priceForClothes;

        double whatIsLeft = movieBudget - totalPriceForMovie;

        if (totalPriceForMovie > movieBudget){
            System.out.printf("Not enough money!\n" +
                    "Wingard needs %.2f leva more.", Math.abs(whatIsLeft));
        }else{
            System.out.printf("Action!\n" +
                    "Wingard starts filming with %.2f leva left.", whatIsLeft);
        }

    }
}
