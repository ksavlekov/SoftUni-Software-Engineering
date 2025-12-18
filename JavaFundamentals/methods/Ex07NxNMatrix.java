import java.util.Scanner;

public class Ex07NxNMatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < num; i++) {
            System.out.println(newString(String.valueOf(num),num));
        }

    }
    public static String newString(String symbol, int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result+= symbol + " ";
        }
        return  result.trim();
    }
}
