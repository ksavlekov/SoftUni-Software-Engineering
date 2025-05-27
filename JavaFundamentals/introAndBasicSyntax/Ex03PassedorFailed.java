import java.util.Scanner;

public class Ex03PassedorFailed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double number = Double.parseDouble(sc.nextLine());

        if (number < 3) {
            System.out.println("Failed!");
        } else {
            System.out.println("Passed!");
        }
    }
}
