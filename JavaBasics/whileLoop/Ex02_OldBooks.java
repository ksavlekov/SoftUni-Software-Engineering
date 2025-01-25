import java.util.Scanner;

public class Ex02_OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String favoriteBook = scanner.nextLine();
        int capacity = Integer.parseInt(scanner.nextLine());

        int count = 0;
        String currentBook = "";

        while (capacity > count) {
            currentBook = scanner.nextLine();

            if (currentBook.equals(favoriteBook)) {
                break;
            }
            count++;
        }
        if (count == capacity) {
            System.out.printf("The book you search is not here!%nYou checked %d books.", capacity);
        } else {
            System.out.printf("You checked %d books and found it.", count);
        }
    }
}
