import java.util.Scanner;

public class Ex09GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String valueType = scanner.nextLine();



        switch (valueType) {
            case "int":
                int first = Integer.parseInt(scanner.nextLine());
                int second = Integer.parseInt(scanner.nextLine());

                System.out.println(getMax(first, second));
                break;
            case "char":
                char firstChar = scanner.nextLine().charAt(0);
                char secondChar = scanner.nextLine().charAt(0);

                System.out.println(getMax(firstChar, secondChar));
                break;

            case "string":

                String valueOne = scanner.nextLine();
                String valueTwo = scanner.nextLine();

                System.out.println(getMax(valueOne, valueTwo));
                break;
            default:

        }

    }

    private static int getMax(int first, int secound) {
        if (first > secound) {
            return first;
        } else{
            return secound;
        }
    }

    private static char getMax(char firstChar, char secoundChar) {
        if (firstChar > secoundChar) {
            return firstChar;
        } else {
            return secoundChar;

        }
    }

    private static String getMax(String valueOne, String valueTwo) {
        if (valueOne.compareTo(valueTwo) > 0) {
            return valueOne;
        }else {
            return valueTwo;
        }
    }

}