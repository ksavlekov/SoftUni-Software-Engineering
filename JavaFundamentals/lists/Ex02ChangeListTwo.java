package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex02ChangeListTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> integerList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        for (int i = 0; i < integerList.size() - 1; i++) {
            int firstNumber = integerList.get(i);
            int lastNumber = integerList.get(integerList.size() - 1);

            int sum = firstNumber + lastNumber;

            integerList.set(i,sum);
            integerList.remove(integerList.size() - 1);
        }

        System.out.println(integerList.toString().replaceAll("\\[|,|\\]", ""));
    }
}
