import java.util.Scanner;

public class Ex10MultiplicationTable {
    public static void main(String [] agrs) {
        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine());
        int counter = 1;
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            sum = num * counter;
            System.out.println(num + " X " + counter + " = " + sum);
            counter ++;
        }

    }
}
