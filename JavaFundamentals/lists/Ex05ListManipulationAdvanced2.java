package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex05ListManipulationAdvanced2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> inputList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {

            String[] token = command.split(" ");

            switch (token[0]) {

                case "Contains":

                    int containsNumber = Integer.parseInt(token[1]);

                    if (inputList.contains(containsNumber)) {

                        System.out.println("Yes");

                    } else {

                        System.out.println("No such number");
                    }
                    break;

                case "Print":

                    if (command.equals("Print even")) {

                        for (int a = 0; a < inputList.size(); a++) {

                            int printEvenValue = inputList.get(a);

                            if (printEvenValue % 2 == 0) {

                                System.out.print(printEvenValue + " ");
                            }
                        }

                    } else if (command.equals("Print odd")) {

                        System.out.println();

                        for (int b = 0; b < inputList.size(); b++) {

                            int printOddValue = inputList.get(b);

                            if (printOddValue % 2 != 0) {

                                System.out.print(printOddValue + " ");
                            }
                        }
                    }
                    break;

                case "Get":

                    System.out.println();

                    int sum = 0;

                    for (int c = 0; c < inputList.size(); c++) {

                        int getSumValue = inputList.get(c);

                        sum += getSumValue;
                    }

                    System.out.print(sum);

                    break;

                case "Filter":

                    int filterNumber = Integer.parseInt(token[2]);

                    if (token[1].equals("<")) {

                        System.out.println();

                        for (int d = 0; d < inputList.size(); d++) {

                            int filterValue = inputList.get(d);

                            if (filterValue < filterNumber) {

                                System.out.print(filterValue + " ");
                            }
                        }

                    } else if (token[1].equals("<=")) {

                        System.out.println();

                        for (int d = 0; d < inputList.size(); d++) {

                            int filterValue = inputList.get(d);

                            if (filterValue <= filterNumber) {

                                System.out.print(filterValue + " ");
                            }
                        }

                    } else if (token[1].equals(">")) {

                        System.out.println();

                        for (int d = 0; d < inputList.size(); d++) {

                            int filterValue = inputList.get(d);

                            if (filterValue > filterNumber) {

                                System.out.print(filterValue + " ");
                            }
                        }

                    } else if (token[1].equals(">=")) {

                        System.out.println();

                        for (int d = 0; d < inputList.size(); d++) {

                            int filterValue = inputList.get(d);

                            if (filterValue >= filterNumber) {

                                System.out.print(filterValue + " ");
                            }
                        }
                    }

                    break;

            }

            command = scanner.nextLine();
        }

    }
}
