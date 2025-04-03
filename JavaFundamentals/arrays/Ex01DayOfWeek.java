import java.util.Scanner;

public class Ex01DayOfWeek {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine());

        String[] dayOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};


            if (num > 0 && num < 8) {
                System.out.println(dayOfWeek[num - 1]);
            } else {
                System.out.println("Invalid day!");
            }

    }
}
