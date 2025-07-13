package Methods;

import java.util.Scanner;

public class ex03_printingTriangle_2 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        isLoop(number);

    }

    private static void isLoop(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");

            }
            System.out.println();

        }

        for (int q = number; q >= 1; q--) {
            for (int w = 1; w < q; w++) {
                System.out.print(w + " ");
            }
            System.out.println();
        }
    }


}
