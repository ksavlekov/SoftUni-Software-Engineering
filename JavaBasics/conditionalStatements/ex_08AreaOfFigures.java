import java.sql.SQLOutput;
import java.util.Scanner;

public class ex_08AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();

        String square = "square";
        String rectangle = "rectangle";
        String circle = "circle";
        String triangle = "triangle";

        if (string.equalsIgnoreCase(square)) {
            double sideSquare = Double.parseDouble(scanner.nextLine());
            double areaSquare = sideSquare * sideSquare;
            System.out.printf("%.3f",areaSquare);
        } else if (string.equalsIgnoreCase(rectangle)) {
            double height = Double.parseDouble(scanner.nextLine());
            double width = Double.parseDouble(scanner.nextLine());
            double areaRectangle = height * width;
            System.out.printf("%.3f",areaRectangle);
        } else if (string.equalsIgnoreCase(circle)) {
            double r = Double.parseDouble(scanner.nextLine());
            double areaCircle = Math.PI * r * r;
            System.out.printf("%.3f",areaCircle);
        } else if (string.equalsIgnoreCase(triangle)) {
            double base = Double.parseDouble(scanner.nextLine());
            double height = Double.parseDouble(scanner.nextLine());
            double areaTriangle = base * height / 2;
            System.out.printf("%.3f",areaTriangle);
        } else {

        }
    }
}
