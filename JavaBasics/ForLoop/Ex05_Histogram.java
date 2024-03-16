import java.util.Scanner;

public class Ex05_Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int insert = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= insert; i++) {

            int number = Integer.parseInt(scanner.nextLine());

            if (number < 200) {
                double p1 = number * 1.0 / insert * 100.0;
                System.out.printf("%.2f", p1);
                System.out.println("%");
            } else if (number >= 200 && number <= 399) {
                double p2 = number * 1.0 / insert * 100.0;
                System.out.printf("%.2f", p2);
                System.out.println("%");
            } else if (number >= 400 && number <= 599) {
                double p3 = number * 1.0 / insert * 100.0;
                System.out.printf("%.2f",p3);
                System.out.println("%");
            } else if (number >= 600 && number <= 799) {
                double p4 = number * 1.0 / insert * 100.0;
                System.out.printf("%.2f",p4);
                System.out.println("%");
            } else if (number >= 800) {
                double p5 = number * 1.0 / insert * 100.0;
                System.out.printf("%.2f",p5);
                System.out.println("%");
            }
        }
    }
}
