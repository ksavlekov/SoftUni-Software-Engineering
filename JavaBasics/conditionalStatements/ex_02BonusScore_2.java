import java.util.Scanner;

public class ex_02BonusScore_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score = Integer.parseInt(scanner.nextLine());
        double bonus = 0;

        if (score <= 100) {
            bonus = 5;
        } else if (score <= 1000) {
            bonus = score * 20 / 100.0;
        }else {
            bonus = score * 10 / 100.0;
        }
        if (score % 2 == 0) {
            //bonus = bonus + 1;
            bonus += 1;
        } else {
            if (score % 10 == 5) {
                bonus +=2;
            }
        }
        System.out.println(bonus);
        System.out.println(bonus + score);
    }
}
