package Arrays;

import java.util.Scanner;

public class ex09_arrayModifier {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] stringInputNumbers = scanner.nextLine().split("\\s+");

        int[] inputNumbers = new int[stringInputNumbers.length];

        for (int i = 0; i < stringInputNumbers.length; i++) {
            inputNumbers[i] = Integer.parseInt(stringInputNumbers[i]);
        }

        String command = scanner.nextLine();

        while (!command.equals("end")) {

            String[] stringInput = command.split("\\s+");

            int indexOne = 0;
            int indexTwo = 0;

            switch (stringInput[0]) {
                case "swap":
                    indexOne = Integer.parseInt(stringInput[1]);
                    indexTwo = Integer.parseInt(stringInput[2]);

                    int tempSwap = 0;

                    tempSwap = inputNumbers[indexOne];
                    inputNumbers[indexOne] = inputNumbers[indexTwo];
                    inputNumbers[indexTwo] = tempSwap;


                    break;
                case "multiply":

                    indexOne = Integer.parseInt(stringInput[1]);
                    indexTwo = Integer.parseInt(stringInput[2]);

                    int multiplyNumbers = inputNumbers[indexOne] * inputNumbers[indexTwo];
                    inputNumbers[indexOne] = multiplyNumbers;


                    break;

                case "decrease":

                    int decrease = -1;

                    for (int w = 0; w < inputNumbers.length; w++) {

                        inputNumbers[w] += decrease;

                    }

                    break;


            }

            command = scanner.nextLine();

        }

        for (int e = 0; e < inputNumbers.length; e++) {
            String output = String.valueOf(inputNumbers[e]);

            System.out.print(output);

            for (int r = e; r < inputNumbers.length - 1; r++) {
                System.out.print(", ");

                break;
            }
        }
    }
}
