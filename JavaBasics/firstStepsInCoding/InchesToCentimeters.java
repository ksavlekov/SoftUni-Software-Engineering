import java.util.Scanner;

public class InchesToCentimeters {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double numberInch = Double.parseDouble(scanner.nextLine());

        double converter = 2.54;

        System.out.println(numberInch * converter);
    }
}
