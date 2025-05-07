package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ex_EvenAndOddSubtraction {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int evenSum = 0;
        int oddSum = 0;

        for (int num :
                arr) {
         if (num % 2 == 0){
             evenSum += num;
         }else{
             oddSum += num;
         }

        }

        if (evenSum > oddSum){
            System.out.println(evenSum);

        }else{
            System.out.println(oddSum);
        }
    }
}
