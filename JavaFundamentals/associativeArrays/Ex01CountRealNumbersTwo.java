package AssociativeArrays;

import java.util.*;

public class Ex01CountRealNumbersTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] doubleInput = Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();

        TreeMap<Double, Integer> counts = new TreeMap<>();

        for (double num:
             doubleInput) {

            if (!counts.containsKey(num)) {

                counts.put(num, 0);
            }

            counts.put(num, counts.get(num) + 1);

        }

        String pattern = "%.0f -> %d";

        for (Map.Entry<Double, Integer> kvp : counts.entrySet()
             ) {

            System.out.println(String.format(pattern, kvp.getKey(), kvp.getValue()));

        }




    }
}
