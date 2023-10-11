import java.util.Scanner;

public class PrOjectCreation {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int num = Integer.parseInt(scanner.nextLine());

        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, (num * 3), num);
    }
}
