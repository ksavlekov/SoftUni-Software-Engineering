import java.util.Scanner;

public class ex05_PasswordGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userPassword = "05. Password Guess";

        String input = scanner.nextLine();

        if (userPassword.equals(input)) {
            System.out.println("Welcome");
        }else {
            System.out.println("Wrong password!");
        }
    }
}
