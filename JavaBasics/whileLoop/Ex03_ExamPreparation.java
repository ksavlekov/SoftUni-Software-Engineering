import java.util.Scanner;

public class Ex03_ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxPoorGrades = Integer.parseInt(scanner.nextLine());

        int scoreAllGrades = 0;
        int counterAllTasks = 0;
        int counterPoorGrades = 0;
        String lastProblem = "";

        while (counterPoorGrades < maxPoorGrades) {
            String task = scanner.nextLine();
            if (task.equals("Enough")) {
                break;
            }

            int currentGrades = Integer.parseInt(scanner.nextLine());

            if (currentGrades <= 4) {
                counterPoorGrades ++;
            }

            counterAllTasks++;
            scoreAllGrades += currentGrades;
            lastProblem = task;
        }

        if (counterPoorGrades == maxPoorGrades) {
            System.out.printf("You need a break, %d poor grades.", counterPoorGrades);
        } else {
            System.out.printf("Average score: %.2f%n", scoreAllGrades * 1.0 / counterAllTasks);
            System.out.printf("Number of problems: %d%n", counterAllTasks);
            System.out.printf("Last problem: %s", lastProblem);
        }
    }
}
