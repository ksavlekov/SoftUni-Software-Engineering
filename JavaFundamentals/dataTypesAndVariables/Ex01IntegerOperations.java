import java.util.Scanner;

public class Ex01IntegerOperations {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        long first = Integer.parseInt(sc.nextLine());
        long second = Integer.parseInt(sc.nextLine());
        long third = Integer.parseInt(sc.nextLine());
        long fourth = Integer.parseInt(sc.nextLine());

        long sum = first + second; // first + second
        long divideSum = sum / third; //divide (first + second) / third
        long multiplySumToFourth = divideSum * fourth; //multiply divideSum * fourth

        System.out.println(multiplySumToFourth);

    }
}
