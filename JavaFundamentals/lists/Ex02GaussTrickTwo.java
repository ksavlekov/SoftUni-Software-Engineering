import javax.print.DocFlavor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex02GaussTrickTwo {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> elements = Arrays.stream(reader.readLine().split(" "))
                .collect(Collectors.toList());


        String input = "";

        while (!"end".equals(input = reader.readLine())) {

            String[] data = input.split("\\s+");

            String command = data[0];

            switch (command) {
                case "Delete":

//                    ArrayList<String> result = new ArrayList<>();
//
//                    for (int i = 0; i < elements.size(); i++) {
//                        if (!elements.get(i).equals(data[1])) {
//                            result.add(elements.get(i));
//                        }
//                    }

                    elements = elements.stream().filter(e -> !e.equals(data[1])).collect(Collectors.toList());
                    break;
                case "Insert":

                    String element = data[1];
                    int position = Integer.parseInt(data[2]);
                    if (position >= 0 && position < elements.size()) {
                        elements.add(position, element);
                    }
                    break;
            }


        }
        System.out.println(elements.toString().replaceAll("[\\[,\\]]", ""));

    }
}
