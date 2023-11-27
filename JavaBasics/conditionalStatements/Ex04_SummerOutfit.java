import java.util.Scanner;

public class Ex04_SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int degrees = Integer.parseInt(scanner.nextLine());
        String text = scanner.nextLine();

        String sweatshirt = "Sweatshirt";
        String sneakers = "Sneakers";
        String shirt = "Shirt";
        String moccasins = "Moccasins";
        String tShirt = "T-Shirt";
        String sandals = "Sandals";
        String swimSuit = "Swim Suit";
        String barefoot = "Barefoot";

        switch (text) {
            case "Morning" :
                if (10 <= degrees && degrees <= 18) {
                    System.out.printf("It's %d degrees, get your %s and %s.", degrees, sweatshirt, sneakers);
                } else if (18 < degrees && degrees <= 24) {
                    System.out.printf("It's %d degrees, get your %s and %s.", degrees, shirt, moccasins);
                } else if (degrees >= 25) {
                    System.out.printf("It's %d degrees, get your %s and %s.", degrees, tShirt, sandals);
                }
            break;
            case "Afternoon" :
                if (10 <= degrees && degrees <= 18) {
                    System.out.printf("It's %d degrees, get your %s and %s.", degrees, shirt, moccasins);
                } else if (18 < degrees && degrees <= 24) {
                    System.out.printf("It's %d degrees, get your %s and %s.", degrees, tShirt, sandals);
                } else if (degrees >= 25) {
                    System.out.printf("It's %d degrees, get your %s and %s.", degrees, swimSuit, barefoot);
                }
            break;
            case "Evening" :
                if (10 <= degrees && degrees <= 18) {
                    System.out.printf("It's %d degrees, get your %s and %s.", degrees, shirt, moccasins);
                } else if (18 < degrees && degrees <= 24) {
                    System.out.printf("It's %d degrees, get your %s and %s.", degrees, shirt, moccasins);
                } else if (degrees >= 25) {
                    System.out.printf("It's %d degrees, get your %s and %s.", degrees, shirt, moccasins);
                }
            break;
        }

    }
}
