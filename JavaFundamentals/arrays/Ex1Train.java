import java.util.Scanner;

public class Ex1Train {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int wagons = Integer.parseInt(sc.nextLine());

        int[] numWagons = new int[wagons];

        int sum = 0;
        for (int i = 0; i < numWagons.length; i++){

            int people = Integer.parseInt(sc.nextLine());
            numWagons[i] = people;
            System.out.print(numWagons[i] + " ");
            sum += numWagons[i];

        }
        System.out.println();
        System.out.println(sum);


    }
}
