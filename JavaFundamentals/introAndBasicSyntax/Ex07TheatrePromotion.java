import java.util.Scanner;

public class Ex07TheatrePromotion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String typeOfDay = sc.nextLine();
        int age = Integer.parseInt(sc.nextLine());

        if (0 <= age && age <= 18) {
            switch (typeOfDay) {
                case "Weekday":
                    System.out.println("12$");
                    break;
                case "Weekend":
                    System.out.println("15$");
                    break;
                case "Holiday":
                    System.out.println("5$");
                    break;
            }
        } else if (18 <= age && age <= 64) {
            switch (typeOfDay) {
                case "Weekday":
                    System.out.println("18$");
                    break;
                case "Weekend":
                    System.out.println("20$");
                    break;
                case "Holiday":
                    System.out.println("12$");
                    break;
            }
        } else if (64 <= age && age <= 122) {
            switch (typeOfDay) {
                case "Weekday":
                    System.out.println("12$");
                    break;
                case "Weekend":
                    System.out.println("15$");
                    break;
                case "Holiday":
                    System.out.println("10$");
                    break;
            }

        } else {
            System.out.println("Error!");
        }
    }
}
