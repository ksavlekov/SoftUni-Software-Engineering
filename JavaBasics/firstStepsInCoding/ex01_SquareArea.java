import java.util.Scanner;

public class ex01_SquareArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        double score = Math.pow(a, 2);

        System.out.println(score);

    }
}
