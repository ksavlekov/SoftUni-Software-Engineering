import java.util.Scanner;

public class PersonalTitles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double oldYears = Double.parseDouble(sc.nextLine());
        String gender = sc.nextLine();


        switch (gender) {
            case "f":
                if (oldYears >= 16) {
                    System.out.println("Ms.");
                } else {
                    System.out.println("Miss");
                }
                break;
            case "m":
                if (oldYears >= 16) {
                    System.out.println("Mr.");
                } else {
                    System.out.println("Master");
                }
                break;
        }
    }
}
