import java.util.Scanner;

public class Ex08_TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jury = Integer.parseInt(scanner.nextLine());
        String presentation = scanner.nextLine();

        double sum = 0.0;
        double averigeGrade = 0.0;
        int count = 0;

        while (!presentation.equals("Finish")) {
            double grade = Double.parseDouble(scanner.nextLine());

            sum += grade;


            presentation = scanner.nextLine();

            count++;
        }

        System.out.printf("%s - %.2f", presentation, averigeGrade);
        averigeGrade = sum / jury;

        System.out.printf("Student's final assessment is %.2f.", averigeGrade / count);
    }


}
