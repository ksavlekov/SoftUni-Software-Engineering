import java.util.Scanner;

public class Ex05_Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());

        double stotinki = money * 100;
        double coins = 0;

        while (stotinki >= 200) {
            coins++;
            stotinki -= 200;
        }

        while (stotinki >= 100) {
            coins++;
            stotinki -= 100;
        }

        while (stotinki >= 50) {
            coins++;
            stotinki -= 50;
        }

        while (stotinki >= 20) {
            coins++;
            stotinki -= 20;
        }

        while (stotinki >= 10) {
            coins++;
            stotinki -= 10;
        }

        while (stotinki >= 5) {
            coins++;
            stotinki -= 5;
        }

        while (stotinki >= 2) {
            coins++;
            stotinki -= 2;
        }

        coins += stotinki;

        System.out.printf("%.0f", Math.floor(coins));

    }
}
