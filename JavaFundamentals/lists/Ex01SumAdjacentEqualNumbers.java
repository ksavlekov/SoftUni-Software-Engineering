package Lists;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex01SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();
        String[] numbers = input.split("\\s+");

        List<Double> doubleList = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            String number = numbers[i];
            doubleList.add(Double.parseDouble(number));
        }

        for (int i = 0; i < doubleList.size() - 1; i++) {
            double firstNumber = doubleList.get(i);
            double secondNumber = doubleList.get(i + 1);

            if (firstNumber == secondNumber) {
                double sum = firstNumber + secondNumber;

                doubleList.set(i, sum);
                doubleList.remove(i + 1);
                i = -1;
            }
        }

        System.out.println(elements(doubleList));

    }

    static String elements (List<Double> list) {
        String someString = "";

        DecimalFormat df = new DecimalFormat("#.###");

        for (Double num : list) {
            someString += df.format(num) + " ";
        }
        return someString.trim();
    }
}
