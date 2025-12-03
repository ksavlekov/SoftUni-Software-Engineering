import java.util.Scanner;

public class Ex01SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int firstNum = Integer.parseInt(sc.nextLine());
        int secondNum = Integer.parseInt(sc.nextLine());
        int thirdNum = Integer.parseInt(sc.nextLine());


        printSmaller(firstNum, secondNum, thirdNum);
    }

    public static void printSmaller(int f, int s, int t) {

        if (f < s && f < t) {
            System.out.println(f);
        } else if (s < f && s < t) {
            System.out.println(s);
        } else {
            System.out.println(t);
        }
    }
}
