import java.util.Scanner;

public class Ex06StrongNumber {

    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       String numberInput = sc.nextLine();

       int sum = 0;

        for (int i = 0; i < numberInput.length(); i++) {

            int number = Integer.parseInt(String.valueOf(numberInput.charAt(i)));

            int factorial = 1;

            for (int j = 1; j <= number; j++) {


                factorial *= j;

            }

            sum += factorial;
        }
        System.out.println(numberInput.equals(String.valueOf(sum)) ? "yes" : "no");
    }


}
