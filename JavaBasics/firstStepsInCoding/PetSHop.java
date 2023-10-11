import java.util.Scanner;

public class PetSHop {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int dogsNumber = Integer.parseInt(scanner.nextLine());
        int oderAnimals = Integer.parseInt(scanner.nextLine());

        double dogFoot = 2.50;
        double foot = 4.00;

        double price = dogsNumber * dogFoot + oderAnimals * foot;

        System.out.printf("%.2f lv.", price);
    }
}
