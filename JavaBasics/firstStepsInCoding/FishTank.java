import java.util.Scanner;

public class FishTank {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int lenght = Integer.parseInt(scanner.nextLine());
        int weight = Integer.parseInt(scanner.nextLine());
        int wight = Integer.parseInt(scanner.nextLine());

        double percent = Double.parseDouble(scanner.nextLine());

        int sumPara = lenght * weight * wight;

        double liters = sumPara * 0.001;

        double persent = percent * 0.01;

        double all = liters * (1 - persent);

        System.out.printf("%.3f",all);


    }
}
