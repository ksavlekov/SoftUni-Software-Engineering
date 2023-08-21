import java.util.Scanner;

public class ex05DanceHall {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double lenght = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double wardrobeSide = Double.parseDouble(scanner.nextLine());

        double areaHall = lenght * 100 * width * 100;
        double areaWardrobe = wardrobeSide * 100 * wardrobeSide * 100;
        double areaBench = areaHall / 10;

        double freeSpace = areaHall - (areaWardrobe + areaBench);

        double dancersCount = freeSpace / (40 + 7000);

        System.out.printf("%.0f", Math.floor(dancersCount));

    }
}
