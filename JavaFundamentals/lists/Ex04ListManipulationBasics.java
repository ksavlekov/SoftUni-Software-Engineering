import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex04ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> read = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String commands = scanner.nextLine();

        while(!commands.equalsIgnoreCase("end")) {

            String[] tokensAdd = commands.split("\\s+");

            switch (tokensAdd[0]) {
                case "Add":

                    int numberToAdd = Integer.parseInt(tokensAdd[1]);

                    read.add(numberToAdd);

                    break;
                case "Remove":

                    int numberToRemove = Integer.parseInt(tokensAdd[1]);

                    read.remove(Integer.valueOf(numberToRemove));

                    break;
                case "RemoveAt":

                    int numberToRemoveAt = Integer.parseInt(tokensAdd[1]);

                    read.remove(numberToRemoveAt);

                    break;
                case "Insert":

                    int numberToInsert = Integer.parseInt(tokensAdd[1]);
                    int indexToInsert = Integer.parseInt(tokensAdd[2]);

                    read.add(indexToInsert, numberToInsert);

                    break;
            }

            commands = scanner.nextLine();
        }

        System.out.println(read.toString().replaceAll("[\\[\\],]", ""));
    }
}
