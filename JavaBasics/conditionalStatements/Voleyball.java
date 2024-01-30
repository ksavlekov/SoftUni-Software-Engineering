import java.util.Scanner;

public class Voleyball  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfYear = scanner.nextLine();
        int holidays = Integer.parseInt(scanner.nextLine());
        int weekends = Integer.parseInt(scanner.nextLine());

        int sofiaWeekend = 48 - weekends;
        double sofiaPlays = sofiaWeekend * (3.0 / 4);
        double holidaysPlays = holidays * (2.0 / 3);

        double allPlays = sofiaPlays + holidaysPlays + weekends;

        if (typeOfYear.equals("leap")) {
            allPlays *= 1.15;
        }

        System.out.printf("%.0f", Math.floor(allPlays));

    }
}
