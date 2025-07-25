package Methods;

import java.util.Scanner;

public class ex06_calculateRectangleArea_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width = Double.parseDouble(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());

        double area = getArea(width, length);
        System.out.printf("%.0f", area);

    }

    static double getArea(double width, double length) {

        return width * length;
    }
}
