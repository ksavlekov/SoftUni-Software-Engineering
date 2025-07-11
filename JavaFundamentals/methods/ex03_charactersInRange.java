package Methods;

import java.util.Scanner;

public class ex03_charactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String one = scanner.nextLine();
        String two = scanner.nextLine();

        charactersInRange(one, two);
    }

    public static void charactersInRange(String one, String two){

        char first = one.charAt(0);
        char second = two.charAt(0);

        int intOne = first;
        int intTwo = second;

        if (intOne > intTwo){
           while(intOne > intTwo + 1){
               intTwo++;
               System.out.print((char)intTwo + " ");
           }
        }else{
            while(intOne + 1 < intTwo){
                intOne++;
                System.out.print((char)intOne + " ");
            }
        }
    }
}
