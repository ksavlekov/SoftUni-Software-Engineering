import java.util.Scanner;

public class ex03_GreaterNumber_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        if (a >= b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
