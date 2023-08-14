import java.util.Scanner;

public class EqualsWords {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        String stOne = sc.nextLine();
        String stTwo = sc.nextLine();

        if (stOne.equalsIgnoreCase(stTwo)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}
