import java.util.Scanner;

public class P04_GroupStage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String teamName = scanner.nextLine();
        int playedGames = Integer.parseInt(scanner.nextLine());

        int allScored = 0;
        int allTake = 0;
        int points = 0;
        for (int i = 0; i < playedGames; i++) {
            int scoredGoal = Integer.parseInt(scanner.nextLine());
            int takeGoal = Integer.parseInt(scanner.nextLine());

            if (scoredGoal > takeGoal){
                points += 3;
            } else if (scoredGoal == takeGoal){
                points += 1;
            }

            allScored += scoredGoal;
            allTake += takeGoal;
        }

        if (allScored >= allTake){
            System.out.printf("%s has finished the group phase with %d points.%n", teamName, points);
        } else {
            System.out.printf("%s has been eliminated from the group phase.%n", teamName);
        }
        System.out.printf("Goal difference: %d.", allScored - allTake);

    }
}
