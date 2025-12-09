import java.util.Scanner;

public class Ex04PasswordValidator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        if (validatePassword(password)) {
            System.out.println("Password is valid");

        }

    }

    public static boolean validatePassword(String p) {

        boolean correctCharCount = validateCount(p);

        boolean onlyLettersAndDigits = validateContain(p);

        boolean haveToDigits = validateDigitCount(p);

        return correctCharCount && onlyLettersAndDigits && haveToDigits;
    }

    private static boolean validateDigitCount(String p) {
        
        int digiCount = 0;

        for (int i = 0; i < p.length() ; i++) {
            char symbol = p.charAt(i);

            if (Character.isDigit(symbol)) {
                digiCount++;

                if (digiCount >= 2) {
                    return true;
                }
            }
        }
        System.out.println("Password must have at least 2 digits");
        return false;
    }

    private static boolean validateContain(String p) {


        for (int i = 0; i < p.length(); i++) {
            char symbol = p.charAt(i);
            if (!Character.isLetterOrDigit(symbol)) {
                System.out.println("Password must consist only of letters and digits");
                return false;
            }
        }

        return true;
    }

    private static boolean validateCount(String p) {
        boolean isValid = p.length() > 5 && p.length() < 11;

        if (!isValid) {
            System.out.println("Password must be between 6 and 10 characters");

            return false;
        }
        return true;
    }
}
