package Lists;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex01SumAdjacentEqualNumbers2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Double::parseDouble).collect(Collectors.toList());

        for (int i = 0; i < numbers.size() - 1; i++) {
            if (numbers.get(i).equals(numbers.get(i + 1))) {

                double sum = numbers.get(i) + numbers.get(i + 1);
                numbers.set(i,sum);
                numbers.remove(i + 1);
                i = i - 1;
            }
        }

        String output = "";

        DecimalFormat df = new DecimalFormat("#.###");

        for (Double number : numbers) {
            output += df.format(number + " ");
        }

        System.out.println(output.toString());


    }
}
