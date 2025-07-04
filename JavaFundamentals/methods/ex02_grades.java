package Methods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex02_grades {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double grade = Double.parseDouble(reader.readLine());

        printInWords(grade);

    }

    static void printInWords (double grade){
        if (grade >= 2 && grade <= 2.99){
            System.out.println("Fail");
        }else if (grade >= 3 && grade <= 3.49){
            System.out.println("Poor");
        }else if (grade >= 3.50 & grade <= 4.49){
            System.out.println("Good");
        }else if (grade >= 4.50 && grade <= 5.49){
            System.out.println("Very good");
        }else if(grade >= 5.50 && grade <= 6.00){
            System.out.println("Excellent");
        }
    }
}
