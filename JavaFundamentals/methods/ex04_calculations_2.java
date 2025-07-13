package Methods;

import java.util.Scanner;

public class ex04_calculations_2 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        String word = scanner.nextLine();
        int numOne = Integer.parseInt(scanner.nextLine());
        int numTwo = Integer.parseInt(scanner.nextLine());

        switch (word){
            case "add":

                isAdd(word, numOne, numTwo);
                break;
            case "multiply":

                isMultiply(word, numOne, numTwo);
                break;
            case "subtract":

                isSubtract(word, numOne, numTwo);
                break;
            case "divide":

                isDivide(word, numOne, numTwo);
                break;
        }
    }

    static void isAdd(String word, int numOne, int numTwo){

        int sum = numOne + numTwo;

        System.out.println(sum);
    }

    static void isMultiply(String word, int numOne, int numTwo){

        int multiplySum = numOne * numTwo;

        System.out.println(multiplySum);
    }

    static void isSubtract(String word, int numOne, int numTwo){

        int subtractSum = numOne - numTwo;

        System.out.println(subtractSum);
    }

    static void isDivide(String word, int numOne, int numTwo){

        int divide = numOne / numTwo;

        System.out.println(divide);
    }

}
