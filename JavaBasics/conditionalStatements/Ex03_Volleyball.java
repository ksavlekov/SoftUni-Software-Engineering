import java.util.Scanner;

public class Ex03_Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String year = scanner.nextLine();
        int holidaysInYear = Integer.parseInt(scanner.nextLine());
        int weekendsInHome = Integer.parseInt(scanner.nextLine());

        int weekendsInSofia = 48 - weekendsInHome;
        double gamesInSofia = weekendsInSofia * 3.0 / 4;
        double gamesInHolidays = holidaysInYear * 2.0 / 3;

        double allGaems = gamesInSofia + gamesInHolidays + weekendsInHome;

        if ("leap".equalsIgnoreCase(year)) {
            allGaems = allGaems + 0.15 * allGaems;
        }
        System.out.printf("%.0f", Math.floor(allGaems));

    }
}
