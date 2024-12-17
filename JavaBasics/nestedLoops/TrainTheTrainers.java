import java.util.Scanner;
public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int juryNumber = Integer.parseInt(scanner.nextLine());
        String presentation = scanner.nextLine();
        double gradeSum = 0;
        double averageGrade = 0;
        double averageGradeSum = 0;
        int counter = 0;

        while (!"Finish".equals(presentation)){
            for (int i = 0; i < juryNumber; i++) {
                double grades = Double.parseDouble(scanner.nextLine());
                gradeSum += grades;
            }
            averageGrade = gradeSum / juryNumber;
            averageGradeSum += averageGrade;
            System.out.printf("%s - %.2f%n", presentation, averageGrade);
            averageGrade = 0;
            gradeSum = 0;
            counter++;
            presentation = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f."
                , averageGradeSum / counter);
    }
}
