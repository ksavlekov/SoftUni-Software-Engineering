package AssociativeArrays;

import java.util.*;

public class Ex02wordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num= Integer.parseInt(scanner.nextLine());

        Map<String, List<String>> someMap = new LinkedHashMap<>();

        for (int i = 0; i < num; i++) {
            String key = scanner.nextLine();
            String value = scanner.nextLine();

            someMap.putIfAbsent(key, new ArrayList<>());

            someMap.get(key).add(value);

        }

        for (Map.Entry<String, List<String>> stringListEntry : someMap.entrySet()) {
            System.out.println(String.format("%s - %s", stringListEntry.getKey(), String.join(", ", stringListEntry.getValue())));
        }



    }
}
