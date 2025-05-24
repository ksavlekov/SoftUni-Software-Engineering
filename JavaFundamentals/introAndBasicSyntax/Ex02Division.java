import java.util.Scanner;

public class Ex02Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine());
        int two = 2;
        int three = 3;
        int six = 6;
        int seven = 7;
        int ten = 10;

        if (num % 10 == 0) {
            System.out.println("The number is divisible by " + ten);
        } else if (num % 7 == 0) {
            System.out.println("The number is divisible by " + seven);
        } else if (num % 6 == 0) {
            System.out.println("The number is divisible by " + six);
        } else if (num % 3 == 0) {
            System.out.println("The number is divisible by " + three);
        } else if (num % 2 == 0) {
            System.out.println("The number is divisible by " + two);
        } else {
            System.out.println("Not divisible");
        }


    }
}
