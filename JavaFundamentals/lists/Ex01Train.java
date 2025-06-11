import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex01Train {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> numbers = Arrays.stream(reader.readLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(reader.readLine());

        String input = reader.readLine();

        while (!"end".equals(input)) {

            String[] data = input.split(" ");

            if (data.length == 2) {
                int number = Integer.parseInt(data[1]);
                numbers.add(number);

            } else {
                int number = Integer.parseInt(data[0]);


                for (int i = 0; i < numbers.size(); i++) {
                   int currentElement =  numbers.get(i);

                   if (currentElement + number <= maxCapacity) {
                       numbers.set(i, currentElement + number);
                       break;
                   }
                }
            }
            input = reader.readLine();
        }
        System.out.println(numbers.toString().replaceAll("[\\[,\\]]", ""));
    }
}
