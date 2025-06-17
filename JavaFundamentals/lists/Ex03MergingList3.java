package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex03MergingList3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> listOne = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> listTwo = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> newList = new ArrayList<>();


        int smallerList = Math.min(listOne.size(), listTwo.size());


        for (int j = 0; j < smallerList; j++) {

            newList.add(listOne.get(j));
            newList.add(listTwo.get(j));

        }

        if (listOne.size() > listTwo.size()) {
            newList.addAll(listOne.subList(smallerList, listOne.size()));
        } else {
            newList.addAll(listTwo.subList(smallerList, listTwo.size()));
        }


        System.out.println(newList.toString().replaceAll("[\\[|,\\]]", ""));


    }
}
