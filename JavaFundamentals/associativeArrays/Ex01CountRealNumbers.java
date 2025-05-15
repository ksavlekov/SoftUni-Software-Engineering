package AssociativeArrays;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ex01CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] nums = Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();

        TreeMap<Double, Integer> counts = new TreeMap<>();

        for (double num : nums) {

//            counts.putIfAbsent(num, 0);

            if (!counts.containsKey(num)) {

                counts.put(num,0);
            }

            int oldValue = counts.get(num);
            counts.put(num, oldValue + 1);
        }

        String pattern = "%.0f -> %d";

        for (Map.Entry<Double, Integer> doubleIntegerEntry : counts.entrySet()) {

            System.out.println(String.format(pattern, doubleIntegerEntry.getKey(), doubleIntegerEntry.getValue()));
        }

        


    }
}
