package Methods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex04_Calculations {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String inputOneString = reader.readLine();
        int inputTwoInt = Integer.parseInt(reader.readLine());
        int inputThreeInt = Integer.parseInt(reader.readLine());

        add(inputOneString, inputTwoInt, inputThreeInt);
        multiply(inputOneString, inputTwoInt, inputThreeInt);
        subtract(inputOneString, inputTwoInt, inputThreeInt);
        divide(inputOneString, inputTwoInt, inputThreeInt);


    }

    static void add(String inputOneString, int inputTwoInt, int inputThreeInt) {
        if (inputOneString.equals("add")) {
            System.out.println(inputTwoInt + inputThreeInt);
        }
    }

    static void multiply(String inputOneString, int inputTwoInt, int inputThreeInt){
        if (inputOneString.equals("multiply")){
            System.out.println( inputTwoInt * inputThreeInt);
        }
    }

    static void subtract(String inputOneString, int inputTwoInt, int inputThreeInt){
        if (inputOneString.equals("subtract")){
            System.out.println( inputTwoInt - inputThreeInt);
        }
    }

    static void divide(String inputOneString, int inputTwoInt, int inputThreeInt){
        if (inputOneString.equals("divide")){
            System.out.println( inputTwoInt / inputThreeInt);
        }
    }


}
