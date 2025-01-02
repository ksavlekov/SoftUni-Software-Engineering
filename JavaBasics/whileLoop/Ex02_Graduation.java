import java.util.Scanner;

public class Ex02_Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        int years = 1;
        double sum = 0;

        while (years <= 12) {

            double grade = Double.parseDouble(scanner.nextLine());

            if (grade >= 4.00) {
                sum += grade;

                years++;
            }

        }
        double average = sum / 12;

        if (average >= 4) {
            System.out.printf("%s graduated. Average grade: %.2f", name, average);
        }
    }
}
