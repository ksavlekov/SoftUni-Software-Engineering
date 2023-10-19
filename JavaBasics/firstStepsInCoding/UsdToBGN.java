import java.util.Scanner;

public class UsdToBGN {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double input = Double.parseDouble(scanner.nextLine());

        double oneUsd = 1.79549;

        oneUsd *= input;

        System.out.printf("%.2f", oneUsd);
    }
}
