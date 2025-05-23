import java.util.Scanner;

public class Ex08LowerOrUpper {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        char a = sc.next().charAt(0);
        String stringValue = String.valueOf(a);
        String estringValue = String.valueOf(a).toLowerCase();

        System.out.println((stringValue.equals(estringValue) ? "lower-case" : "upper-case"));
    }
}
