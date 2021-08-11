package Arrays;

import java.util.Scanner;

public class ex01_DayOfWeek {
    public static void main(String[] args) {

        String[] dayNames = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        Scanner sc = new Scanner(System.in);

        int day = Integer.parseInt(sc.nextLine());

        if (day >= 1 && day <= 7){
            System.out.println(dayNames[day- 1]);
        }else{
            System.out.println("Invalid day!");
        }

    }
}