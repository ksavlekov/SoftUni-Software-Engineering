import java.util.Scanner;

public class ex_06ThreeBrothers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double brat1 = Double.parseDouble(scanner.nextLine());
        double brat2 = Double.parseDouble(scanner.nextLine());
        double brat3 = Double.parseDouble(scanner.nextLine());
        double bashtaFishing = Double.parseDouble(scanner.nextLine());

        double cleaning = 1 / (1 / brat1 + 1 / brat2 + 1 / brat3);
        double cleaningWithRest = cleaning + cleaning * 15 / 100.0;

        System.out.printf("Cleaning time: %.2f\n", cleaningWithRest);

        if (bashtaFishing < cleaningWithRest) {

            System.out.printf("No, there isn't a surprise - " + "shortage of time -> %.0f hours.", Math.ceil(cleaningWithRest - bashtaFishing));
        } else {

            System.out.printf("Yes, there is a surprise - " + "time left -> %.0f hours.",Math.floor(bashtaFishing - cleaningWithRest));
        }
    }
}
