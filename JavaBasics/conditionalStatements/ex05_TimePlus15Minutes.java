import java.util.Scanner;

public class ex05_TimePlus15Minutes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hourInput = Integer.parseInt(scanner.nextLine());
        int minutesInput = Integer.parseInt(scanner.nextLine());

        int hoursInMinutes = hourInput * 60;

        int sum = hoursInMinutes + minutesInput + 15;

        int clockHours = sum / 60;
        int clockMinutes = sum % 60;

//        System.out.println(clockHours);
//        System.out.println(clockMinutes);

        if (clockMinutes < 10){
            if (clockHours > 23){
                clockHours = 0;
                System.out.printf("%d:0%d", clockHours, clockMinutes);
            }else {
                System.out.printf("%d:0%d", clockHours, clockMinutes);
            }
        }else if (clockHours > 23){
            clockHours = 0;
            System.out.printf("%d:%d", clockHours, clockMinutes);
        }else{
            System.out.printf("%d:%d", clockHours, clockMinutes);
        }

    }
}
