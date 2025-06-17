package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex05ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> input = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals(" end")){

            String[] commandContains = command.split("\\s+");
            switch (command) {
                case "Contains":

                    int numberContains = Integer.parseInt(commandContains[1]);

                    if (input.contains(numberContains)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
            }


            command = scanner.nextLine();
        }

    }
}
