package TextProcessingAndRegularExpressions;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.*;

public class Ex04TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] stringOfBannedWords = scanner.nextLine().split("\\s+");
        String[] text = scanner.nextLine().split("\\s+");

        List<String> bannedList = new ArrayList<>();

        Map<String, List<String>> finalText = new TreeMap<>();

        for (int i = 0; i < text.length; i++) {
            String word = text[i];
//            finalText


            for (int j = 0; j < stringOfBannedWords.length; j++) {
                String bannedWord = stringOfBannedWords[i];

                bannedList.add(bannedWord);

                if (stringOfBannedWords.equals(word)) {

                }

            }

        }
    }
}
