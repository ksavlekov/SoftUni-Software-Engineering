package Methods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex09_greaterOfTwoValues {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        String type = reader.readLine();
        String inputTwo = reader.readLine();
        String inputThree = reader.readLine();


        switch (type) {
            case "string":
                System.out.println(getMax(inputTwo, inputThree));
                break;
            case "char":
                char firstChar = inputTwo.charAt(0);
                char secondChar = inputThree.charAt(0);

                System.out.println(getMax(firstChar, secondChar));
                break;
            case "int":

                int firstInt = Integer.parseInt(inputTwo);
                int secondInt = Integer.parseInt(inputThree);

                System.out.println(getMax(firstInt, secondInt));
                break;
        }


    }

    static String getMax(String firstString, String secondString) {
        if (firstString.compareTo(secondString) >= 0) {
            return firstString;
        }

        return secondString;
    }

    static int getMax(int firstInt, int secondInt) {
        if (firstInt > secondInt) {
            return firstInt;
        }

        return secondInt;
    }

    static char getMax(char firstChar, char secondChar) {
        if (firstChar > secondChar) {
            return firstChar;
        }
        return secondChar;
    }
}
