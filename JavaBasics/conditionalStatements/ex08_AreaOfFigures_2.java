import java.util.Scanner;

public class ex08_AreaOfFigures_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String shapeType = scanner.nextLine();

        double area = 0;

        if (shapeType.equals("square")) {
            double side = Double.parseDouble(scanner.nextLine());
         area = side * side;

        }else if (shapeType.equals("rectangle")) {
            double sideA = Double.parseDouble(scanner.nextLine());
            double sideB = Double.parseDouble(scanner.nextLine());

            area = sideA * sideB;

        }else if (shapeType.equals("circle")) {
            double r = Double.parseDouble(scanner.nextLine());

            area = r * r * Math.PI;

        }else if(shapeType.equals("triangle"))  {
            double sideA = Double.parseDouble(scanner.nextLine());
            double h = Double.parseDouble(scanner.nextLine());

            area = sideA * h /2;
        }
        System.out.printf("%.3f", area);
    }
}
