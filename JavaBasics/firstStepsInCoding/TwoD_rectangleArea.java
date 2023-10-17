import java.util.Scanner;

public class TwoD_rectangleArea {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());

        double sumX = Math.abs(x1 - x2);
        double sumY = Math.abs(y1 - y2 );

        double area = sumX * sumY;
        double perimeter = 2 * (sumX + sumY);

        System.out.printf("%.2f%n",area);
        System.out.printf("%.2f", perimeter);

    }
}
