import java.util.Scanner;

public class ShoppingManiac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        if (budget == 0) {
            System.out.println("For 0 clothes I spent 0 lv and have 0 lv left.");
            return;
        }
        String line = scanner.nextLine();

        int clothes = 0;
        int totalSpendings = 0;

        while (!line.equals("enough") && budget > 0) {

            if (line.equals("enter")) {
                String line1 = scanner.nextLine();
                while (!line1.equals("leave")) {

                    int spendings = Integer.parseInt(line1);
                    if (budget >= spendings) {
                        budget -= spendings;
                        totalSpendings += spendings;
                        clothes++;
                        if (budget <= 0) {
                            break;
                        }
                    } else {
                        System.out.println("Not enough money.");
                    }

                    line1 = scanner.nextLine();
                }
            }

            if (budget <= 0) {
                break;
            }
            line = scanner.nextLine();
        }

        System.out.println("For " + clothes
                + " clothes I spent "
                + totalSpendings + " lv and have "
                + budget + " lv left.");
    }
}
