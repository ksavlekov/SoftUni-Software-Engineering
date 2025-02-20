import java.util.Scanner;

public class Ex05_Walking2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int target = 10000;
        int stepsCount = 0;

        while (stepsCount < target) {
            if (input.equals("Going home")) {
                input = scanner.nextLine();
                stepsCount += Integer.parseInt(input);
                break;
            }
            int steps = Integer.parseInt(input);
            stepsCount += steps;
            if (stepsCount>=target){
                break;
            }
            input = scanner.nextLine();
        }
        if (stepsCount<target){
            int moreSteps=target-stepsCount;
            System.out.printf("%d more steps to reach goal.", moreSteps);
        }else{
            System.out.println("Goal reached! Good job!");
        }
    }
}