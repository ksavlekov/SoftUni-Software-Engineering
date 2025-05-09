package Arrays;

import java.util.Scanner;

public class IntToString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        if (n >= -100 && n <= 100){

            String s = Integer.toString(n);
            if (n == Integer.parseInt(s)){
                System.out.println("Good job");

            }else{
                System.out.println("Wrong answer");

            }
        }
    }
}