import java.util.Scanner;

public class Ex02SumDigits {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int number = Integer.parseInt(sc.nextLine());

        int sum = 0;

        while (0 != number){
            sum += number % 10;

            number /= 10;

        }

        System.out.println(sum);

    }
}
