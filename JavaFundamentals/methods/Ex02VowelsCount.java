import java.util.Scanner;

public class Ex02VowelsCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        System.out.println(getCountVowels(text));
    }

    public static int getCountVowels(String s) {
        int counter = 0;

        String strToLowerCase = s.toLowerCase();

        for (int i = 0; i < strToLowerCase.length(); i++) {

            switch (strToLowerCase.charAt(i)) {
                case 'a':
                    counter++;
                    break;
                case 'e':
                    counter++;
                    break;
                case 'o':
                    counter++;
                    break;
                case 'u':
                    counter++;
                    break;
                case'i':
                    counter++;
                    break;
            }
        }
        return counter;
    }
}
