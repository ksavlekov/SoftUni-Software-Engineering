import java.util.Scanner;

public class ex06_AreaOfFigures {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        switch(input){
            case ("square"):

                double a = Double.parseDouble(scanner.nextLine());

                double s = a * a;
                System.out.printf("%.3f", s);
                break;
            case ("rectangle"):

                double b = Double.parseDouble(scanner.nextLine());
                double c = Double.parseDouble(scanner.nextLine());

                double ss = b * c;
                System.out.printf("%.3f", ss);
                break;

            case ("circle"):

                double d = Double.parseDouble(scanner.nextLine());

                double sss = Math.PI * d * d;
                System.out.printf("%.3f", sss);
                break;

            case ("triangle"):

                double e = Double.parseDouble(scanner.nextLine());
                double f = Double.parseDouble(scanner.nextLine());

                double ssss = (e * f) / 2;
                System.out.printf("%.3f", ssss);
                break;

        }

    }
}
