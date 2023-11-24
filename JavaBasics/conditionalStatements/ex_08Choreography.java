import java.util.Scanner;

public class ex_08Choreography {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stepsCount = Integer.parseInt(scanner.nextLine());
        int dancersCount = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        double stepsPerdayProcent = Math.ceil((stepsCount * 100.0 / days) / stepsCount);
        double dancerPercent = stepsPerdayProcent / dancersCount;

        if (stepsPerdayProcent < 13) {
            System.out.printf("Yes, they will succeed in that goal! %.2f%%.", dancerPercent);
        } else {
            System.out.printf("No, They will not succeed in that goal!" + " Required %.2f%% steps to be learned per day.", dancerPercent);
        }
    }
}
