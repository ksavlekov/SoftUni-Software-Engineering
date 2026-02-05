package Ex04.ArticlesTwoPointZero;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Articles> articles = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] input = (scanner.nextLine().split(", "));
            Articles article = new Articles(input[0], input[1], input[2]);
            articles.add(article);
        }
        String command = scanner.nextLine();

        switch (command){
            case "title":
                articles = articles.stream()
                        .filter(article -> !article.getTitle().isEmpty())
                        .sorted((a1,a2) -> a1.getTitle().compareTo(a2.getTitle()))
                        .collect(Collectors.toList());
                for (Articles article : articles) {
                    System.out.println(article);
                }
                break;
            case "content":
                articles = articles.stream()
                        .filter(article -> !article.getContent().isEmpty())
                        .sorted((a1,a2) -> a1.getContent().compareTo(a2.getContent()))
                        .collect(Collectors.toList());
                for (Articles article : articles) {
                    System.out.println(article);
                }
                break;
            case "author":
                articles = articles.stream()
                        .filter(article -> !article.getAuthor().isEmpty())
                        .sorted((a1,a2) -> a1.getAuthor().compareTo(a2.getAuthor()))
                        .collect(Collectors.toList());
                for (Articles article : articles) {
                    System.out.println(article);
                }
                break;
        }
    }
}
