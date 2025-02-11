import java.util.Scanner;

public class Ex05_Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int numOfSteps = 0;

        while(!command.equalsIgnoreCase("going home")){
            int steps = Integer.parseInt(command);
            numOfSteps += steps;
            if (numOfSteps >= 10000){
                System.out.println("Goal reached! Good job!");
                return;
            }
            command = scanner.nextLine();
        }
        int finishSteps = Integer.parseInt(scanner.nextLine());
        numOfSteps += finishSteps;
        if(numOfSteps < 10000){
            System.out.printf("%d more steps to reach goal.", 10000 - numOfSteps);
        }else {
            System.out.println("Goal reached! Good job!");
        }
    }
}