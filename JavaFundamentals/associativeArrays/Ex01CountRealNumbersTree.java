package AssociativeArrays;

import java.text.DecimalFormat;
import java.util.*;

public class Ex01CountRealNumbersTree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] inputNumbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();

        Map<Double,Integer> someMap = new TreeMap<>();

        for (double input : inputNumbers) {

            if (!someMap.containsKey(input)) {
                someMap.put(input,0);
            }

            int count = someMap.get(input) + 1;

            someMap.put(input, count);
        }

        DecimalFormat df = new DecimalFormat("#.##");

        for (Map.Entry<Double, Integer> someKey : someMap.entrySet()) {

            System.out.println(df.format(someKey.getKey()) + " -> " + df.format(someKey.getValue()));

        }
    }

}

