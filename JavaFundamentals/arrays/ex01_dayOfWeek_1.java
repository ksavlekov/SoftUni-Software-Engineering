package Arrays;

import java.util.Scanner;

public class ex01_dayOfWeek_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        String[] stringArrayDaysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday",
        "Sunday"};

        if (number > 0 && number <= 7){
            System.out.println(stringArrayDaysOfWeek[number - 1]);
        }else{
            System.out.println("Invalid day!");
        }
    }
}
