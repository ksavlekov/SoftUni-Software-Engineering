import java.util.Scanner;

public class ex09_YardGreening {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double occupiedPercents = Double.parseDouble(scanner.nextLine());

        double aquariumLitersOfWather = (length * width * height) * 0.001;

        occupiedPercents = occupiedPercents * 0.01;
        System.out.printf("%.3f", (aquariumLitersOfWather * (1-occupiedPercents)));
    }
}
