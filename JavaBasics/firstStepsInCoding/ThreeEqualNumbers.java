import java.util.Scanner;

public class ThreeEqualNumbers {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int numberOne = Integer.parseInt(sc.nextLine());
        int numberTwo = Integer.parseInt(sc.nextLine());
        int numberThree = Integer.parseInt(sc.nextLine());

        if (numberOne == numberTwo && numberTwo == numberThree && numberThree == numberOne) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
