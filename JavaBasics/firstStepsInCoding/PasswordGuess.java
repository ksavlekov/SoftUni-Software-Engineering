import java.util.Scanner;

public class PasswordGuess {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        String st = sc.nextLine();

        if (st.equalsIgnoreCase("s3cr3t!P@ssw0rd")){
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }


    }
}
