import java.util.Scanner;

public class PartyInvitation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double invalid = 0;
        double valid = 0;
        String name = scanner.nextLine().toLowerCase();
        while (!name.equals("statistic")) {
            boolean isTrue = true;

            for (int i = 0; i < name.length(); i++) {
                if (!((int) name.charAt(i) <= 122 && (int) name.charAt(i) >= 97)) {
                    isTrue = false;
                }
            }
            if (isTrue) {
                int firstLetter = name.charAt(0) - 32;
                String print = (char) firstLetter + "";
                for (int i = 1; i < name.length(); i++) {
                    print += name.charAt(i);
                }
                System.out.println(print);
                valid++;
            } else {
                System.out.println("Invalid name!");
                invalid++;
            }
            name = scanner.nextLine().toLowerCase();
        }
        System.out.printf("Valid names are %.2f%% from %.0f names.%n"
                , (valid / (valid + invalid)) * 100, valid + invalid);

        System.out.printf("Invalid names are %.2f%% from %.0f names."
                , (invalid / (valid + invalid)) * 100, valid + invalid);
    }
}