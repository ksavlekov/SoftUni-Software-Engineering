package Methods;

import java.util.Scanner;

public class ex01_signOfIntegerNumbers_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        extracted(scanner);
    }

     static void extracted(Scanner scanner) {
        int number = Integer.parseInt(scanner.nextLine());

        if (number > 0){
            System.out.printf("The number %d is positive.", number);
        }else if(number < 0){
            System.out.printf("The number %d is negative.", number);
        }else {
            System.out.printf("The number %d is zero.", number);
        }
    }
}
