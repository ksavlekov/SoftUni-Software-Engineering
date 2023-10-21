import java.util.Scanner;

public class YardGreening {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double squareKilometres = Double.parseDouble(scanner.nextLine());

        double oneSquareKilometre = 7.61;

        double sum = oneSquareKilometre * squareKilometres;

        double discount = 0.18;

        discount *= sum;

        double allPrice = sum - discount;

        System.out.printf("The final price is: %.2f lv.%n", allPrice);
        System.out.printf("The discount is: %.2f lv.", discount);
    }
}
