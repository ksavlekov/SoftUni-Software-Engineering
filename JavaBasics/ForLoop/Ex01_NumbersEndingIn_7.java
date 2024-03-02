import java.util.Scanner;

public class Ex01_NumbersEndingIn_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int num = 7; num <= 997; num++) {
            if (num % 10 == 7) {
                System.out.println(num);
            }
        }
    }
}
