package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex03MergingListsTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> inputListOne = Arrays.stream(scanner.nextLine()
                .split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> inputListTwo = Arrays.stream(scanner.nextLine()
                .split(" ")).map(Integer::parseInt).collect(Collectors.toList());


        if (inputListOne.size() > inputListTwo.size()) {

            List<Integer> resultList = new ArrayList<>();

            for (int i = 0; i < inputListTwo.size(); i ++) {

                resultList.add(inputListOne.get(i));
                resultList.add(inputListTwo.get(i));

            }

            resultList.addAll(inputListOne.subList(inputListTwo.size(), inputListOne.size()));

            System.out.println(resultList.toString().replaceAll("\\[|,|\\]", ""));

        } else {

            List<Integer> resultList = new ArrayList<>();

            for (int i = 0; i < inputListOne.size(); i ++) {

                resultList.add(inputListOne.get(i));
                resultList.add(inputListTwo.get(i));

            }

            resultList.addAll(inputListTwo.subList(inputListOne.size(), inputListTwo.size()));

            System.out.println(resultList.toString().replaceAll("\\[|,|\\]", ""));
        }


    }
}
