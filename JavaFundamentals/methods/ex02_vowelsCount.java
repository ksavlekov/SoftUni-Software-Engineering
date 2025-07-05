package Methods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex02_vowelsCount {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        String input = reader.readLine();
        int vowels = countOfVowels(input);

        System.out.println(vowels);


    }

    public static int countOfVowels(String input){

        int count = 0;

        for (int i = 0; i < input.length(); i++) {

            char r = input.charAt(i);
            String w = String.valueOf(r);

            switch (w.toLowerCase()) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                case "y":
                    count++;

                    break;
            }
        }


        return count;
    }


}
