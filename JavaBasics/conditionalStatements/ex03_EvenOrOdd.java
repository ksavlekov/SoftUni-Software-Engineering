import java.util.Scanner;

public class ex03_EvenOrOdd {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());

        if (a % 2 != 0){
            System.out.println("odd");
        }else{
            System.out.println("even");
        }
    }
}
