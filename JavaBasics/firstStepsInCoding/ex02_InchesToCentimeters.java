import java.util.Scanner;

public class ex02_InchesToCentimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double inches = Double.parseDouble(scanner.nextLine());

        double sm = inches * 2.54;

        System.out.println(sm);
    }
}
