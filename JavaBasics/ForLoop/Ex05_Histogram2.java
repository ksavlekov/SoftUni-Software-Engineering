import java.util.Scanner;

public class Ex05_Histogram2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;

        for (int i = 0; i < count; i++) {
            int num = Integer.parseInt(scanner.nextLine());

            if (num <  200) {
                p1++;

            } else if (num < 400) {
                p2++;

            } else if (num < 600) {
                p3++;

            } else if ( num < 800) {
                p4++;

            } else {
                p5++;
            }
        }

        double p1proc = p1 * 1.0 / count * 100.0;
        double p2proc = p2 * 1.0 / count * 100.0;
        double p3proc = p3 * 1.0 / count * 100.0;
        double p4proc = p4 * 1.0 / count * 100.0;
        double p5proc = p5 * 1.0 / count * 100.0;

        System.out.printf("%.2f%%%n", p1proc);
        System.out.printf("%.2f%%%n", p2proc);
        System.out.printf("%.2f%%%n", p3proc);
        System.out.printf("%.2f%%%n", p4proc);
        System.out.printf("%.2f%%%n", p5proc);
    }
}
