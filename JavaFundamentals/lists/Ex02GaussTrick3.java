package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex02GaussTrick3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> inputList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        int asd = inputList.size() / 2;

        for (int i = 0; i < asd; i++) {
            int firstIndex = inputList.get(i);
            int lastIndex = inputList.get(inputList.size() - 1);

            int sum = firstIndex + lastIndex;

            inputList.set(i, sum);
            inputList.remove(inputList.size() - 1);

        }

        for (int index : inputList) {

            System.out.print(String.format("%s ", index));

        }



    }
}
