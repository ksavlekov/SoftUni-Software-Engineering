import java.util.Scanner;

public class P06_TicketCombination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberCombination = Integer.parseInt(scanner.nextLine());

        int count = 0;
        String ticketComb = "";
        int sumChar = 0;
        for (char i = 'B'; i <= 'L'; i+=2) {
            for (char j = 'f'; j >= 'a'; j--) {
                for (char k = 'A'; k <= 'C'; k++) {
                    for (int l = 1; l <= 10; l++) {
                        for (int m = 10; m >= 1; m--) {
                            count++;
                            if (count == numberCombination){
                                ticketComb = "" + i + j + k + l + m;
                                sumChar = i + j + k + l + m;
                            }
                        }
                    }
                }
            }
        }

        System.out.printf("Ticket combination: %s%n", ticketComb);
        System.out.printf("Prize: %d lv.", sumChar);

    }
}
