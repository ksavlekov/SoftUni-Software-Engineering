import java.util.Scanner;

public class Ex08_VowelsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine().toLowerCase();

        int vowelSum = 0;

        for (int i = 0; i < word.length(); i++) {
            char currentLetter = word.charAt(i);

            switch (currentLetter) {
                case 'a':
                    vowelSum += 1;
                    break;
                case 'e':
                    vowelSum += 2;
                    break;
                case 'i':
                    vowelSum += 3;
                    break;
                case 'o':
                    vowelSum += 4;
                    break;
                case 'u':
                    vowelSum += 5;
                    break;
            }


        }
        System.out.println(vowelSum);
    }
}
