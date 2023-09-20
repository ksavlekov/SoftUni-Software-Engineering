import java.util.Scanner;

public class Ex03SquareArea {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int side = Integer.parseInt(sc.nextLine());

        double squareArea = Math.pow(side, 2.0);

        System.out.println(String.format("%.0f", squareArea));
    }
}
