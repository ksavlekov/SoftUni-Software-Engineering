import java.util.Scanner;

public class Ex05Login {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        String userName = sc.nextLine();
        String password = sc.nextLine();

        String name = userName;
        String reverse = "";
        int count = 1;

        for (int i = name.length() - 1; i >= 0 ; i--) {

            reverse = reverse + name.charAt(i);
        }

        while (!password.equalsIgnoreCase(reverse)) {


            if (count > 3) {
                System.out.printf("User %s blocked!", userName);
                return;

            } if (!password.equalsIgnoreCase(reverse)){
                System.out.println("Incorrect password. Try again.");

            }
            count++;
            password = sc.nextLine();


        }
        System.out.printf("User %s logged in.", userName);




    }
}
