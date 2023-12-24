import java.util.Scanner;

public class OnTimeForExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hourOfExam = Integer.parseInt(scanner.nextLine());
        int minutesOfExam = Integer.parseInt(scanner.nextLine());
        int hourOfArrive = Integer.parseInt(scanner.nextLine());
        int minutesOfArrive = Integer.parseInt(scanner.nextLine());

        int timeOfExam = (hourOfExam * 60) + minutesOfExam;
        int timeOfArrive = (hourOfArrive * 60) + minutesOfArrive;


        if (timeOfArrive > timeOfExam) {
            int timeLate = timeOfArrive - timeOfExam;

            if (timeLate >= 60) {
                int lateHours = timeLate / 60;
                int lateMins = timeLate % 60;
                System.out.println("Late");
                System.out.printf("%d:%02d hours after the start", lateHours, lateMins);
            } else {
                System.out.println("Late");
                System.out.printf("%d minutes after the start", timeLate);
            }
        } else if (timeOfArrive < timeOfExam) {
            int timeEarly = timeOfExam - timeOfArrive;

            if (timeEarly > 30 && timeEarly < 60) {
                int earlyHours = timeEarly /60;
                int earlyMins = timeEarly % 60;
                System.out.println("Early");
                System.out.printf("%02d minutes before the start", earlyMins);
            } else if (timeEarly > 30 && timeEarly >= 60) {
                int earlyHours = timeEarly /60;
                int earlyMins = timeEarly % 60;
                System.out.println("Early");
                System.out.printf("%d:%02d hours before the start", earlyHours, earlyMins);
            } else {
                System.out.println("On time");
                System.out.printf("%d minutes before the start", timeEarly);
            }
        } else {
            System.out.println("On time");
        }

    }
}