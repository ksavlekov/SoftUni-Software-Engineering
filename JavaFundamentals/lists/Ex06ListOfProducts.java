package Lists;

import java.util.*;
import java.util.stream.Collectors;

public class Ex06ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        List<String> productList = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String product = scanner.nextLine();

            productList.add(product);

        }

        Collections.sort(productList);

        for (int i = 0; i < productList.size(); i++) {

            int index = i + 1;
            String product = productList.get(i);

            System.out.println(String.format("%d.%s", index,product));
        }



    }
}
