import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOfDay = Integer.parseInt(sc.nextLine());

        String [] daysAsString = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        if (numberOfDay <= 0 || numberOfDay > 7) {

            System.out.println("Invalid day!");
        } else {

            System.out.println(daysAsString[numberOfDay - 1]);
        }

    }
}
