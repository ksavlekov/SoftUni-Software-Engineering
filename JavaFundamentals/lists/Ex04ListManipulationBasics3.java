package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex04ListManipulationBasics3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> inputList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();



        while (!command.equals("end")) {


            String[] regex = command.split(" ");

            switch (regex[0]) {

                case "Add":
                    int addNumber = Integer.parseInt(regex[1]);
                    inputList.add(addNumber);
                    break;

                case "Remove":
                    int removeNumber = Integer.parseInt(regex[1]);
                    inputList.remove(removeNumber);
                    break;

                case "RemoveAt":
                    int removeAtNumber = Integer.parseInt(regex[1]);
                    inputList.remove(inputList.get(removeAtNumber));
                    break;

                case "Insert":
                    int insertNumber = Integer.parseInt(regex[1]);
                    int insertIndex = Integer.parseInt(regex[2]);

                    inputList.add(insertIndex, insertNumber);
                    break;

            }
            command = scanner.nextLine();

        }

        System.out.println(inputList.toString().replaceAll("[\\[\\],]", ""));


    }
}
