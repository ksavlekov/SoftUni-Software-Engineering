package Methods;

import java.util.Scanner;

public class ex01_smallestOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int one = Integer.parseInt(scanner.nextLine());
        int two = Integer.parseInt(scanner.nextLine());
        int three = Integer.parseInt(scanner.nextLine());

        int i = printTheSmallestOfThreeIntegerNumbers(one, two, three);

        System.out.println(i);


    }

    public static int printTheSmallestOfThreeIntegerNumbers (int one, int two, int three){
        if (one < two && one < three){
                return one;
        }else if (two < one && two < three){

            return two;

        }else{
            return three;
        }
    }

}
