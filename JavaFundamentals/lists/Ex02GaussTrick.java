package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex02GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> input = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int initialization = input.size() / 2;
        for (int i = 0; i < initialization; i++) {

            int firstNum = input.get(i);
            int index = input.size() - 1;
            int lastNum = input.get(index);

            input.set(i, firstNum + lastNum);
            input.remove(index);
        }

        System.out.println(input.toString().replaceAll("\\[|,|\\]", ""));


    }
}
