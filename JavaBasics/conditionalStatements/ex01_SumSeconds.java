import java.util.Scanner;

public class ex01_SumSeconds {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int firstSpeedster = Integer.parseInt(scanner.nextLine());
        int secondSpeedster = Integer.parseInt(scanner.nextLine());
        int thirdSpeedster = Integer.parseInt(scanner.nextLine());

        int sumSeconds = firstSpeedster + secondSpeedster + thirdSpeedster;

        int seconds = sumSeconds % 60;
        int minutes = sumSeconds / 60;

        if (seconds < 10){
            System.out.println(minutes + ":0" + seconds);
        }else{
            System.out.printf("%d:%d", minutes, seconds);
        }

    }
}
