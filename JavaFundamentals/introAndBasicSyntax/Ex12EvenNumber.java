import java.util.Scanner;

public class Ex12EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());


        while (num % 2 != 0) {

            if (num % 2 == 0) {

                continue;
            } else {
                System.out.println("Please write an even number.");
            }

            num = Integer.parseInt(scanner.nextLine());
        }
        System.out.printf("The number is: %d", Math.abs(num));

    }
}
