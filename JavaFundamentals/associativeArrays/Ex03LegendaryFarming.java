package AssociativeArrays;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex03LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Integer> keyMaterials = new LinkedHashMap<>();

        keyMaterials.put("shards", 0);
        keyMaterials.put("fragments", 0);
        keyMaterials.put("motes", 0);

        LinkedHashMap<String, Integer> junks = new LinkedHashMap<>();

        String winner = "";
        boolean flag = false;

        do {

            String[] data = scanner.nextLine().split("\\s+");

            for (int i = 0; i < data.length; i += 2) {

                int quantity = Integer.parseInt(data[i]);

                String material = data[i + 1].toLowerCase();


                if (!keyMaterials.containsKey(material)) {

                    if (!junks.containsKey(material)) {
                        junks.put(material, quantity);
                    } else {
                        junks.put(material, junks.get(material) + quantity);

                    }

                } else {

                    keyMaterials.put(material, keyMaterials.get(material) + quantity);

                    if (keyMaterials.get(material) >= 250) {

                        keyMaterials.put(material, keyMaterials.get(material) - 250);

                        winner = material;

                        flag = true;

                        break;


                    }
                }

            }


        } while (!flag);

        if (winner.equals("shards")) {

            System.out.println("Shadowmourne obtained!");

        } else if (winner.equals("motes")) {

            System.out.println("Dragonwrath obtained!");

        } else if (winner.equals("fragments")) {

            System.out.println("Valanyr obtained!");

        }

       keyMaterials.entrySet().stream().sorted((e1, e2) -> {
            int sort = Integer.compare(e2.getValue(), e1.getValue());

            if (sort == 0) {
                sort = e1.getKey().compareTo(e2.getKey());
            }

            return sort;
        }).forEach(e -> {

           System.out.println(String.format("%s: %d", e.getKey(), e.getValue()));

       });

        junks.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getKey))
                .forEach(e -> {

                    System.out.println(String.format("%s: %d", e.getKey(), e.getValue()));

                });


    }
}
