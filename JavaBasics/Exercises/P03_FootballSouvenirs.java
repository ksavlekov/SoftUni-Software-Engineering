import java.util.Scanner;

public class P03_FootballSouvenirs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String team = scanner.nextLine();
        String typeSouvenir = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        boolean validCountry = true;
        boolean validType = true;

        double priceSouvenir = 0;
        switch (team) {
            case "Argentina":
                switch (typeSouvenir) {
                    case "flags":
                        priceSouvenir = 3.25;
                        break;
                    case "caps":
                        priceSouvenir = 7.20;
                        break;
                    case "posters":
                        priceSouvenir = 5.10;
                        break;
                    case "stickers":
                        priceSouvenir = 1.25;
                        break;
                    default:
                        validType = false;
                        break;
                }
                break;
            case "Brazil":
                switch (typeSouvenir) {
                    case "flags":
                        priceSouvenir = 4.20;
                        break;
                    case "caps":
                        priceSouvenir = 8.50;
                        break;
                    case "posters":
                        priceSouvenir = 5.35;
                        break;
                    case "stickers":
                        priceSouvenir = 1.20;
                        break;
                    default:
                        validType = false;
                        break;

                }
                break;

            case "Croatia":
                switch (typeSouvenir) {
                    case "flags":
                        priceSouvenir = 2.75;
                        break;
                    case "caps":
                        priceSouvenir = 6.90;
                        break;
                    case "posters":
                        priceSouvenir = 4.95;
                        break;
                    case "stickers":
                        priceSouvenir = 1.10;
                        break;
                    default:
                        validType = false;
                        break;
                }
                break;

            case "Denmark":
                switch (typeSouvenir) {
                    case "flags":
                        priceSouvenir = 3.10;
                        break;
                    case "caps":
                        priceSouvenir = 6.50;
                        break;
                    case "posters":
                        priceSouvenir = 4.80;
                        break;
                    case "stickers":
                        priceSouvenir = 0.90;
                        break;
                    default:
                        validType = false;
                        break;
                }
                break;
            default:
                validCountry = false;
        }

        if (validCountry && validType){
            System.out.printf("Pepi bought %d %s of %s for %.2f lv.", quantity, typeSouvenir, team, quantity * priceSouvenir);
        } else if (!validCountry){
            System.out.println("Invalid country!");
        } else {
            System.out.println("Invalid stock!");
        }
    }
}
