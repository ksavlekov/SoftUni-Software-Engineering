import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex01RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> newList = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        while (!newList.isEmpty()) {

            Random random = new Random();

            int randomIndex = random.nextInt(newList.size());

            String word = newList.get(randomIndex);

            System.out.println(word);

            newList.remove(randomIndex);

        }

    }
}
