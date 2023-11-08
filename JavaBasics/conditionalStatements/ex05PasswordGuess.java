import java.util.Scanner;

public class ex05PasswordGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        String string2 = "s3cr3t!P@ssw0rd";

        if (string.equals(string2)) {
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }
    }
}
