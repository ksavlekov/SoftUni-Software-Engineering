import java.util.Scanner;

public class ex08_AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String shapeType = scanner.nextLine();

        if (shapeType.equals("square")) {
            double side = Double.parseDouble(scanner.nextLine());
            double area = side * side;

            System.out.printf("%.3f", area);

        }else if (shapeType.equals("rectangle")) {
            double sideA = Double.parseDouble(scanner.nextLine());
            double sideB = Double.parseDouble(scanner.nextLine());

            double area = sideA * sideB;
            System.out.printf("%.3f", area);
        }else if (shapeType.equals("circle")) {
            double r = Double.parseDouble(scanner.nextLine());

            double area = r * r * Math.PI;

            System.out.printf("%.3f", area);


        }else if(shapeType.equals("triangle"))  {
            double sideA = Double.parseDouble(scanner.nextLine());
            double h = Double.parseDouble(scanner.nextLine());

            double area = sideA * h /2;

            System.out.printf("%.3f", area);



        }

    }
}
