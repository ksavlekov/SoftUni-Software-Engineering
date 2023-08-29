import java.util.Scanner;

public class ex09_RadiansToDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radian = Double.parseDouble(scanner.nextLine());
        double degrees = radian * 180 / Math.PI;

        System.out.printf("%.0f", degrees);
    }
}
