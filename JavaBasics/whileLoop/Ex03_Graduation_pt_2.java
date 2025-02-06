import java.util.Scanner;

public class Ex03_Graduation_pt_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double yearGrade = Double.parseDouble(scanner.nextLine());

        int year = 1;
        double averageGrade = 0;

        while (year <= 12) {
            yearGrade = Double.parseDouble(scanner.nextLine());

            if (yearGrade >= 4) {

                year++;

            } else if (yearGrade <= 4) {
                System.out.printf("%s has been excluded at %d grade", name, year);
            }
        }

        double totalAverageGrade = averageGrade / 12;

        if (yearGrade == 12 ) {
            System.out.printf("%s graduated. Average grade: %.2f", name, totalAverageGrade);
        }
    }
}
