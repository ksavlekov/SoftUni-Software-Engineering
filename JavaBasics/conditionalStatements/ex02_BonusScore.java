import java.util.Scanner;

public class ex02_BonusScore {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int inputNumber = Integer.parseInt(scanner.nextLine());

        double bonus1 = 0;
        if (inputNumber <= 100){
            bonus1 = 5;

        }else if(inputNumber > 1000){
            bonus1 = inputNumber * 0.10;

        }else{
            bonus1 = inputNumber * 0.20;
        }

        double bonus2 = 0;

        if (inputNumber % 2 == 0){
            bonus2 = 1;

        } else if (inputNumber % 10 == 5){
            bonus2 = 2;

        }

        double totalBonus = bonus1 + bonus2;
        double sum = inputNumber + totalBonus;

        System.out.println(totalBonus);
        System.out.println(sum);
    }
}
