import java.util.Scanner;

public class Ex11MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int counter = secondNum;

        if (secondNum < 11) {
            for (int i = secondNum; i <= 10; i++) {

                sum = num * counter;
                System.out.printf("%d X %d = %d%n",num,counter, sum );
                counter += 1;
            }

        } else {
            sum = num * counter;
            System.out.printf("%d X %d = %d", num, secondNum, sum);
        }

    }
}
