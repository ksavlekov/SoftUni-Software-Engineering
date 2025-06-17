import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex03MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> firstNumbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondNumbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());


        List<Integer> result = new ArrayList<>();

        int minValue = Math.min(firstNumbers.size(), secondNumbers.size());

        for (int i = 0; i < minValue; i++) {

            result.add(firstNumbers.get(i));
            result.add(secondNumbers.get(i));
        }

        if (firstNumbers.size() > secondNumbers.size()) {
            result.addAll(firstNumbers.subList(minValue, firstNumbers.size()));

        } else {
            result.addAll(secondNumbers.subList(minValue, secondNumbers.size()));

        }

        System.out.println(result.toString().replaceAll("\\[|,|\\]", ""));
    }
}
