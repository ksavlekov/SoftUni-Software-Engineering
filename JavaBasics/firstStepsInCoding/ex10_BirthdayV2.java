import java.util.Scanner;

public class ex10_BirthdayV2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int lenght = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double sizeAquarium = lenght * width * height;
        double totalLiters = sizeAquarium * 0.001;
        double calcolationPercent = percent * 0.01;

        double liters = totalLiters * (1 - calcolationPercent);

        System.out.printf("%.3f", liters);


    }
}
