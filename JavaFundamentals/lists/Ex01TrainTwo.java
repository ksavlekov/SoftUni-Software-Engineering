package Lists;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex01TrainTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        List<Double> doubleList = new ArrayList<>();

        for (String s : input) {
            double number = Double.parseDouble(s);
            doubleList.add(number);
        }

//        System.out.println(doubleList);


        for (int i = 0; i < doubleList.size() - 1; i++) {
            double sum = 0;
            double numOne = doubleList.get(i);
            double numOTwo = doubleList.get(i + 1);

            if (numOne == (numOTwo)) {
                sum += (numOne + numOTwo);

                doubleList.set(i, sum);
                doubleList.remove(numOTwo);
                i = -1;

            }

        }

        DecimalFormat df = new DecimalFormat("#.####");

        for (double num:doubleList) {
            System.out.print(df.format(num));
            System.out.print(" ");
        }
    }
}
