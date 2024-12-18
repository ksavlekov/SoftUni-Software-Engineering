import java.util.Scanner;

public class Ex01_NumberInRangeFrom1to100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Еnter a number in the range [1...100]: ");
        int number = Integer.parseInt(scanner.nextLine());


        while (1 > number || number > 100) {

            System.out.println("Invalid number!");
            System.out.println("Еnter a number in the range [1...100]: ");
            number = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("The number is: " + number);

    }
}
