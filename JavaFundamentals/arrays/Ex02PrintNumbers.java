import java.util.Scanner;

public class Ex02PrintNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine());

        int[] arrayNum = new int[num];

        for (int i = 0; i < arrayNum.length; i++) {
            arrayNum[i] = Integer.parseInt(sc.nextLine());
//            System.out.println(arrayNum[i]);
        }

        for (int i = arrayNum.length - 1; i >= 0 ; i--) {
            System.out.print(arrayNum[i] + " ");
        }
    }
}
