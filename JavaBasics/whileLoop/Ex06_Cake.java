import java.util.Scanner;

public class Ex06_Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        int allPieces = width * length;
        String input = "";
        int taken = 0;

        while (taken <= allPieces ){
            input = scanner.nextLine();

            if (input.equals("STOP"))
                break;

            taken = taken + Integer.parseInt(input);
        }
        if ( taken > allPieces){
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(allPieces-taken));

        } else
            System.out.printf("%d pieces are left.", Math.abs(taken - allPieces));
    }
}