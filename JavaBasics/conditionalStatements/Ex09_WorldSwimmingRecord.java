import java.util.Scanner;

public class Ex09_WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordInSeconds = Double.parseDouble(scanner.nextLine());
        double metersToSwim = Double.parseDouble(scanner.nextLine());
        double timeInSeconds = Double.parseDouble(scanner.nextLine());

        double additionalTime = Math.floor(metersToSwim / 15) * 12.5;
        double totalTime = (metersToSwim * timeInSeconds) + additionalTime;
        double time = totalTime - recordInSeconds;

        if (recordInSeconds <= totalTime) {
            System.out.printf("No, he failed! He was %.2f seconds slower.", time);
        } else {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        }
    }
}
