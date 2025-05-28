import java.util.Scanner;

public class Ex04BackIn30Minutes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hours = Integer.parseInt(sc.nextLine());
        int minutes = Integer.parseInt(sc.nextLine());

        int hh = hours;
        int sum = minutes + 30;



        if (sum < 10) {
            System.out.printf("%d:%d", hh, sum);
        } else if (sum > 59){
            sum -= 60;
            hh += 1;

            if (hh > 23) {
                hh = 0;
            }

            System.out.printf("%d:0%d", hh, sum);
        }
    }
}
