package AssociativeArrays;

import java.util.*;

public class Ex03OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split("\\s+");

        Map<String, Integer> counts = new LinkedHashMap<>();

        for (int i = 0; i < words.length; i++) {
            String index = words[i].toLowerCase();
//            counts.putIfAbsent(index, counts.get(index + 1));

            if (counts.containsKey(index)){
                counts.put(index, counts.get(index) + 1);
            } else {
                counts.put(index, 1);

            }
        }

        List<String> odds = new ArrayList<>();

        for (Map.Entry<String, Integer> stringIntegerEntry : counts.entrySet()) {
            if (stringIntegerEntry.getValue() % 2 == 1) {
                odds.add(stringIntegerEntry.getKey());
            }
        }

        for (int i = 0; i < odds.size(); i++) {
            System.out.print(odds.get(i));

            if (i < odds.size() - 1) {
                System.out.print(", ");
            }
        }



    }
}
