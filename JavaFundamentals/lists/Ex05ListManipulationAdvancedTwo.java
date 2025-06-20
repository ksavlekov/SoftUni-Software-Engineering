package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex05ListManipulationAdvancedTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equalsIgnoreCase("end")) {

            String[] tokens = input.split(" ");

            switch (tokens[0]) {

                case "Contains":
                    int numberToContains = Integer.parseInt(tokens[1]);

                    if (numbers.contains(numberToContains)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;

                case "Print":

                    switch (tokens[1]) {

                        case "even":

                            for (int number : numbers) {

                                if (number % 2 == 0) {

                                    System.out.print(number + " ");
                                }

                            }

                            System.out.println();

                            break;

                        case "odd":

                            for (int number : numbers) {

                                if (number % 2 != 0) {

                                    System.out.print(number + " ");

                                }
                            }

                            System.out.println();

                            break;
                    }

                    break;


                case "Get":

                    if (tokens[1].equalsIgnoreCase("sum")) {

                        int sum = 0;

                        for (int number : numbers) {

                            sum += number;
                        }

                        System.out.println(sum);
                    }

                    break;

                case "Filter":

                    switch (tokens[1]) {
                        case ">=":

                            for (int number : numbers) {

                                int filterNumber = Integer.parseInt(tokens[2]);

                                if (numbers.get(number) >= filterNumber) {

                                    System.out.print(number + " ");
                                }
                            }

                            break;

                        case "<=":

                            for (int number : numbers) {

                                int filterNumber = Integer.parseInt(tokens[2]);

                                if (numbers.get(number) <= filterNumber) {

                                    System.out.print(number + " ");
                                }
                            }

                            break;
                        case "<":

                            for (int number : numbers) {

                                int filterNumber = Integer.parseInt(tokens[2]);

                                if (numbers.get(number) < filterNumber) {

                                    System.out.print(number + " ");
                                }
                            }
                            break;

                        case ">":

                            for (int number : numbers) {

                                int filterNumber = Integer.parseInt(tokens[2]);

                                if (numbers.get(number) > filterNumber) {

                                    System.out.print(number + " ");
                                }
                            }

                            break;


                    }

                    break;
            }

            input = scanner.nextLine();
        }

        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));

    }
}
