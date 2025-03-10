package Arrays;

import java.util.Scanner;

public class ex01_train_02 {
    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in);

        int countOfTrainWagons = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        for (int i = 0; i < countOfTrainWagons; i++){
            int people = Integer.parseInt(scanner.nextLine());

            sum += people;

            System.out.print(people + " ");

        }
        System.out.println();

        System.out.println(sum);

    }

}
