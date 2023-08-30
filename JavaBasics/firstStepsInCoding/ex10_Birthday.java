import java.util.Scanner;

public class ex10_Birthday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int insertLenght = Integer.parseInt(scanner.nextLine());
        int insertWidth = Integer.parseInt(scanner.nextLine());
        int insertHeight = Integer.parseInt(scanner.nextLine());
        double insertPercent = Double.parseDouble(scanner.nextLine());

        double capacityAquarium = insertLenght * insertWidth * insertHeight;
        double totalLitersAquarium = capacityAquarium * 0.001;
        double percent = insertPercent * 0.01;
        double calculateLiters = totalLitersAquarium * (1 - percent);

        System.out.printf("%.3f", calculateLiters);

    }
}
