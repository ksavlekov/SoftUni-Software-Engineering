import java.util.Scanner;

public class Ex06MiddleCharacters {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String str = scanner.nextLine();

        String result = getMiddleChars(str);

        System.out.println(result);

    }

    public static String getMiddleChars(String str) {

        String result = "";

        int middleIndex = str.length() / 2;

        if (str.length() % 2 == 0) {

            result +=str.charAt(middleIndex - 1);
            result +=str.charAt(middleIndex);
        }else {

            result += str.charAt(middleIndex);
        }

        return  result;
    }
}
