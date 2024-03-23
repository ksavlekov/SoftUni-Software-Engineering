import java.util.Scanner;

public class Ex07_Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tabsCount = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        int facebookFine = 150;
        int instagramFine = 100;
        int redditFine = 50;

        for (int i = 0; i < tabsCount; i++) {
            String tab = scanner.nextLine();

            switch (tab.toLowerCase()) {
                case "facebook":
                    salary -= facebookFine;
                    break;
                case "instagram" :
                    salary -= instagramFine;
                    break;
                case "reddit":
                    salary -= redditFine;
                    break;
            }

            if (salary <= 0) {
                System.out.println("You have lost your salary.");
                return;
            }
        }
        System.out.println(salary);


    }
}
