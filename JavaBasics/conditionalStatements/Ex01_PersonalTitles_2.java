import java.util.Scanner;

public class Ex01_PersonalTitles_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double age = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();

        if (age < 16 && gender.equalsIgnoreCase("f")) {
            System.out.println("Miss");
        } else if (age >= 16 && gender.equalsIgnoreCase("f")) {
            System.out.println("Ms.");
        } else if (age < 16 && gender.equalsIgnoreCase("m")) {
            System.out.println("Master");
        } else {
            System.out.println("Mr.");
        }
    }
}

