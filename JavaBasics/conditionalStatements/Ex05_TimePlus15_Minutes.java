import java.util.Scanner;

public class Ex05_TimePlus15_Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int fifteenMinutes = 15;

        int totalMinutes = minutes + fifteenMinutes;
        int totalHours = hours;

        if (totalMinutes >= 60) {
            totalHours = totalHours + 1;
            totalMinutes = totalMinutes % 60;
        }
        String minFormat = "";
        if (totalMinutes < 10) {
            minFormat = "0" + totalMinutes;
        } else {
            minFormat = "" + totalMinutes;
        }

        if (totalHours >= 24) {
            totalHours = totalHours - 24;
        }

        System.out.printf("%d:%s",totalHours,minFormat);

    }
}
