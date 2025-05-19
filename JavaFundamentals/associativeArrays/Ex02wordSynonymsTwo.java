package AssociativeArrays;

import java.util.*;

public class Ex02wordSynonymsTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        Map<String, List<String>> dictionary = new LinkedHashMap<>();

        for (int i = 0; i < number; i++) {
            String key = scanner.nextLine();
            String value = scanner.nextLine();

            dictionary.putIfAbsent(key, new ArrayList<>());
            dictionary.get(key).add(value);
        }

        for (Map.Entry<String, List<String>> stringListEntry : dictionary.entrySet()) {
            System.out.println(String.format("%s - %s",stringListEntry.getKey(), String.join(", ", stringListEntry.getValue())));
        }


    }
}
