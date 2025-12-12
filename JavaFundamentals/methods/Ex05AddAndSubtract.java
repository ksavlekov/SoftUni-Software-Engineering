import java.util.Scanner;

public class Ex05AddAndSubtract {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine());
        int numTwo = Integer.parseInt(sc.nextLine());
        int numThree = Integer.parseInt(sc.nextLine());


        int sum = (num(sc, num)+numTwo(sc, numTwo))- numThree(sc, numThree);

        System.out.println(sum);
    }

    public static int num(Scanner sc ,int num) {

        return num;
    }

    public static int numTwo(Scanner sc ,int numTwo) {

        return numTwo;
    }
    public static int numThree(Scanner sc ,int numThree) {

        return numThree;
    }

}
