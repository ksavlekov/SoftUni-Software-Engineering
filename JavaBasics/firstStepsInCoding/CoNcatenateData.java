import java.util.Scanner;

public class CoNcatenateData {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String surname = scanner.nextLine();
        int years = Integer.parseInt(scanner.nextLine());
        String town = scanner.nextLine();


        System.out.printf("You are %s %s, a %d-years old person from %s.", name, surname, years, town);
    }
}
