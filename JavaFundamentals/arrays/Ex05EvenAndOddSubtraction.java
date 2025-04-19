import java.util.Scanner;

public class Ex05EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int[] inputNum = new int[input.length];


        for (int i = 0; i < input.length; i++) {
            inputNum[i] = Integer.parseInt(input[i]);
        }

        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < inputNum.length; i++) {

            if (inputNum[i] % 2 == 0 ) {

                sumEven += inputNum[i];
            } else {
                sumOdd += inputNum[i];
            }
        }
        int sumEvenAndOdd = sumEven - sumOdd;

        System.out.println(sumEvenAndOdd);

    }




}
