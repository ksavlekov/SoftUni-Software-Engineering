package AssociativeArrays;

import java.util.*;

public class Ex01CountRealNumbersFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();

        List<Double> doubleList = new ArrayList<>();

        for (double num : numbers) {
            doubleList.add(num);
        }
//        System.out.println(doubleList);

        Map<Double, Integer> counts = new TreeMap<>();

        for (int i = 0; i < doubleList.size(); i++) {
            double key = doubleList.get(i);

            if (!counts.containsKey(key)) {
                counts.putIfAbsent(key, 0);
            }
            int value = counts.get(key) + 1;
            counts.put(key, value);
        }

        String pattern = "%.0f -> %d";

        for (Map.Entry<Double, Integer> keyValue : counts.entrySet()){

            System.out.println(String.format(pattern, keyValue.getKey(), keyValue.getValue()));
        }
    }
}
