package Ex02.Articles;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] data = scanner.nextLine().split(", ");

        Article article = new Article(data[0], data[1], data[2]);

        int n = Integer.parseInt(scanner.nextLine());

        while ((n-- > 0)) {

            String[] tokens = scanner.nextLine().split(": ");
            String command = tokens[0];

            if (command.equals("Edit")) {

                article.edit(tokens[1]);

            }else if (command.equals("ChangeAuthor")) {

                article.changerAuthor(tokens[1]);

            }else {

                article.rename(tokens[1]);
            }
        }

        System.out.println(article.toString());

    }
}


