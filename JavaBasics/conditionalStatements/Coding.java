import java.util.Scanner;
public class Coding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int currentNumber = 0;
        int charCode = 0;

        while ( number > 0 ){
            currentNumber = number % 10;

            if ( currentNumber == 0 ){
                System.out.println("ZERO");
            } else {
                charCode = currentNumber + 33;
                char symbol = (char)charCode;

                for (int i = 0; i < currentNumber; i++) {
                    System.out.print(symbol);
                }
                System.out.println();
            }
            number /= 10 ;
        }
    }
}
