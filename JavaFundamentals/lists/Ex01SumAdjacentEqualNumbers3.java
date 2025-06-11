package Lists;

import java.io.BufferedReader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ex01SumAdjacentEqualNumbers3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       double[] inputNumbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();

        List<Double> list = new ArrayList<>();

        for (int i = 0; i < inputNumbers.length; i++) {
            double index = inputNumbers[i];

            list.add(index);
        }

        for (int i = 0; i < list.size() - 1; i++) {
            double indexOfList = list.get(i);
            double indexTwoOfList = list.get(i + 1);

            double sumList = 0;

            if (indexOfList == indexTwoOfList) {

                sumList = indexOfList + indexTwoOfList;
                list.set(i, sumList);
                list.remove(i + 1);

                i = -1;

            }
        }

        DecimalFormat df = new DecimalFormat("#.##");

        for (double element : list) {
            System.out.printf(String.format("%s ",df.format(element)) );


        }
    }
}
